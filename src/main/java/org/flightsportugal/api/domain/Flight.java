package org.flightsportugal.api.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;


@Getter
@Setter
@EqualsAndHashCode
public class Flight {

    private Long id;
    private String code;
    private Company airCompany;
    private Airport departureAirport;
    private Airport arrivalAirport;
    private LocalDate departureDay;
    private LocalDate arrivalDay;
    private Price price;
    private Price bagPrice;


    public Flight(Long id, String code, Company airCompany, Airport departureAirport, Airport arrivalAirport, LocalDate departureDay, LocalDate arrivalDay, Price price, Price bagPrice) {
        this.id = id;
        this.code = code;
        this.airCompany = airCompany;
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
        this.departureDay = departureDay;
        this.arrivalDay = arrivalDay;
        this.price = price;
        this.bagPrice = bagPrice;
    }

    public Flight() {
    }
}

