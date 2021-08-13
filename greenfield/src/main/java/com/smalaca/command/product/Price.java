package com.smalaca.command.product;

import java.math.BigDecimal;

public class Price {
    private final BigDecimal value;

    private Price(BigDecimal value) {
        this.value = value;
    }

    static Price of(BigDecimal price) {
        return new Price(price);
    }
}
