package com.smalaca.architecture;

import com.tngtech.archunit.lang.syntax.ArchRuleDefinition;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("2021-08-13-code-structure.md")
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
                .because("2021-08-13-code-structure.md")
                .check(GreenFieldAppClasses.get());
    }

    @Test
    void commandShouldBeIndependent() {
        ArchRuleDefinition.classes().that()
                .resideInAPackage(COMMAND)
                .should().onlyAccessClassesThat().resideInAnyPackage(COMMAND, JAVA)
                .because("2021-08-13-code-structure.md")
                .check(GreenFieldAppClasses.get());
    }

    @Test
    void queryShouldDependOnPersistence() {
        ArchRuleDefinition.classes().that()
                .resideInAPackage(QUERY)
                .should().onlyAccessClassesThat().resideInAnyPackage(QUERY, JAVA, PERSISTANCY)
                .because("2021-08-13-code-structure.md")
                .check(GreenFieldAppClasses.get());
    }

    @Test
    void persistencyShouldDependOnCommand() {
        ArchRuleDefinition.classes().that()
                .resideInAPackage(PERSISTANCY)
                .should().onlyAccessClassesThat().resideInAnyPackage(PERSISTANCY, JAVA, COMMAND)
                .because("2021-08-13-code-structure.md")
                .check(GreenFieldAppClasses.get());
    }
}
