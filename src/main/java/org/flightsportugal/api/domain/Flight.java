package org.flightsportugal.api.domain;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.Instant;
import java.time.LocalDate;


@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@Entity
@Table(name="flights")
public class Flight {

    @Id
    @GeneratedValue
    private Long id;
    private String code;
    @ManyToOne(cascade = CascadeType.ALL)
    @Column(name="air_company")
    private Company airCompany;
    @Column(name="departure_airport")
    @ManyToOne(cascade = CascadeType.ALL)
    private Airport departureAirport;
    @Column(name="arrival_airport")
    @ManyToOne(cascade = CascadeType.ALL)
    private Airport arrivalAirport;
    @Column(name="departure_day")
    private LocalDate departureDay;
    @Column(name="arrival_day")
    private LocalDate arrivalDay;
    @OneToOne(cascade = CascadeType.ALL)
    private Price price;
    @OneToOne(cascade = CascadeType.ALL)
    private Price bagPrice;
    private Instant createdDate;


    public Flight(String code, Company airCompany, Airport departureAirport, Airport arrivalAirport, LocalDate departureDay, LocalDate arrivalDay, Price price, Price bagPrice) {
        this.code = code;
        this.airCompany = airCompany;
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
        this.departureDay = departureDay;
        this.arrivalDay = arrivalDay;
        this.price = price;
        this.bagPrice = bagPrice;
        this.createdDate = Instant.now();
    }

    public Flight() {
    }
}

