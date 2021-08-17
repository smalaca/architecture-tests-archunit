package com.smalaca.architecture;

import com.tngtech.archunit.library.GeneralCodingRules;
import org.junit.jupiter.api.Test;

public class ClassStructureTest {
    @Test
    void shouldNotUseFieldInjection() {
        GeneralCodingRules.NO_CLASSES_SHOULD_USE_FIELD_INJECTION.check(GreenFieldAppClasses.get());
    }

    @Test
    void shouldNotThrowGeneralException() {
        GeneralCodingRules.NO_CLASSES_SHOULD_THROW_GENERIC_EXCEPTIONS.check(GreenFieldAppClasses.get());
    }
}
