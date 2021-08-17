package com.smalaca.architecture;

import com.tngtech.archunit.lang.syntax.ArchRuleDefinition;
import org.junit.jupiter.api.Test;

public class ImmutableObjectsTest {
    @Test
    void shouldAllImmutableObjectsHasGotFinalFields() {
        ArchRuleDefinition.classes().that()
                .haveSimpleNameEndingWith("View")
                .or().haveSimpleNameEndingWith("ReadModel")
                .or().haveSimpleNameEndingWith("Command")
                .should()
                .haveOnlyFinalFields()
                .check(GreenFieldAppClasses.get());
    }
}
