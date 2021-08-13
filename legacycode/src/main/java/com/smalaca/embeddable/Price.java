package com.smalaca.embeddable;

import javax.persistence.Embeddable;
import java.math.BigDecimal;

@Embeddable
public class Price {
    private BigDecimal value;

    private Price() {}

    private Price(BigDecimal value) {
        this.value = value;
    }

    public static Price of(BigDecimal price) {
        return new Price(price);
    }

    public BigDecimal value() {
        return value;
    }
}
