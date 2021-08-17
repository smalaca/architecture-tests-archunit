package com.smalaca.architecture;

import com.tngtech.archunit.lang.syntax.ArchRuleDefinition;
import org.junit.jupiter.api.Test;

public class NamingConventionTest {
    @Test
    void shouldNotContainInterfaceWordInInterfaceName() {
        ArchRuleDefinition.classes().that().areInterfaces()
                .should().haveSimpleNameNotEndingWith("Interface")
                .check(GreenFieldAppClasses.get());
    }

    @Test
    void shouldNotContainImplInClassName() {
        ArchRuleDefinition.classes().that().areNotInterfaces()
                .should().haveSimpleNameNotEndingWith("Impl")
                .check(GreenFieldAppClasses.get());
    }
}
