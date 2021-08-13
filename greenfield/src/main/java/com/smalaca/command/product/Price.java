package com.smalaca.command.product;

import javax.persistence.Embeddable;
import java.math.BigDecimal;

@Embeddable
public class Price {
    private BigDecimal value;

    private Price() {}

    private Price(BigDecimal value) {
        this.value = value;
    }

    static Price of(BigDecimal price) {
        return new Price(price);
    }

    public BigDecimal value() {
        return value;
    }
}
