package org.flightsportugal.api.domain;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@AllArgsConstructor
@Getter
@EqualsAndHashCode
public class Price {

    private final double value;
    private final String currency;
}
