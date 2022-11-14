package org.flightsportugal.api.domain;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;

@AllArgsConstructor
@EqualsAndHashCode
public class Company {

    private final String code;
    private final CompanyName name;
    private final String country;

    public enum CompanyName {
        TAP,
        RYANAIR
    }

}
