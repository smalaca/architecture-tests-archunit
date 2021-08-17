package com.smalaca.architecture;

import com.tngtech.archunit.lang.syntax.ArchRuleDefinition;
import org.junit.jupiter.api.Test;

public class PackageStructureTest {
    private static final String JAVA = "java..";
    private static final String REST = "..rest..";
    private static final String COMMAND = "..command..";
    private static final String QUERY = "..query..";
    private static final String PERSISTANCY = "..persistency..";

    @Test
    void restShouldDependOnlyOnCommandAndQuery() {
        ArchRuleDefinition.classes().that()
                .resideInAPackage(REST)
                .should().onlyAccessClassesThat()
                .resideInAnyPackage(JAVA, REST, COMMAND, QUERY)
                .check(GreenFieldAppClasses.get());
    }

    @Test
    void commandShouldBeIndependent() {
        ArchRuleDefinition.classes().that()
                .resideInAPackage(COMMAND)
                .should().onlyAccessClassesThat().resideInAnyPackage(COMMAND, JAVA)
                .check(GreenFieldAppClasses.get());
    }

    @Test
    void queryShouldDependOnPersistence() {
        ArchRuleDefinition.classes().that()
                .resideInAPackage(QUERY)
                .should().onlyAccessClassesThat().resideInAnyPackage(QUERY, JAVA, PERSISTANCY)
                .check(GreenFieldAppClasses.get());
    }

    @Test
    void persistencyShouldDependOnCommand() {
        ArchRuleDefinition.classes().that()
                .resideInAPackage(PERSISTANCY)
                .should().onlyAccessClassesThat().resideInAnyPackage(PERSISTANCY, JAVA, COMMAND)
                .check(GreenFieldAppClasses.get());
    }
}
