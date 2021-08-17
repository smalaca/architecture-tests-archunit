package com.smalaca.architecture;

import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import com.tngtech.archunit.core.importer.ImportOption;
import com.tngtech.archunit.lang.syntax.ArchRuleDefinition;
import org.junit.jupiter.api.Test;

public class NamingConventionTest {
    @Test
    void shouldNotContainInterfaceWordInInterfaceName() {
        ArchRuleDefinition.classes().that().areInterfaces()
                .should().haveSimpleNameNotEndingWith("Interface")
                .check(greenFieldAppClasses());
    }

    private JavaClasses greenFieldAppClasses() {
        return new ClassFileImporter()
                .withImportOption(ImportOption.Predefined.DO_NOT_INCLUDE_JARS)
                .withImportOption(ImportOption.Predefined.DO_NOT_INCLUDE_TESTS)
                .importPackages("com.smalaca");
    }
}
