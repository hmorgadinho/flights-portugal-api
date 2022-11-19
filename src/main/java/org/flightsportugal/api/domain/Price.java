package org.flightsportugal.api.domain;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@AllArgsConstructor
@Getter
@EqualsAndHashCode
public class Price {
    public enum Currency{
        EUR, USD, GBP, CHY
    }

    private double value;
    @Enumerated(EnumType.STRING)
    private Currency currency;

}

