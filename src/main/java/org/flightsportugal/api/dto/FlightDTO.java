package org.flightsportugal.api.dto;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import org.flightsportugal.api.domain.Airport;
import org.flightsportugal.api.domain.Company;
import org.flightsportugal.api.domain.Price;

import java.time.LocalDate;


@AllArgsConstructor
@Getter
@EqualsAndHashCode
public class FlightDTO {

    private final String code;
    private final Company airCompany;
    private final Airport departureAirport;
    private final Airport arrivalAirport;
    private final LocalDate departureDayTime;
    private final LocalDate arrivalDayTime;
    private final Price price;
    private final Price bagPrice;
    private double avgPrice;

}
