package org.flightsportugal.api.domain;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@AllArgsConstructor
@Getter
@EqualsAndHashCode
public class Airport {

    private final String code;
    private final String name;
    private final City city;
    private final String country;

    public enum City {
        LISBON,
        PORTO
    }


}

