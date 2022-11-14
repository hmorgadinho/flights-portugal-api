package org.flightsportugal.api.infrastructure.data;

import lombok.*;
import org.flightsportugal.api.domain.Airport;
import org.flightsportugal.api.domain.Company;
import org.flightsportugal.api.domain.Price;

import javax.persistence.*;
import java.time.Instant;
import java.time.LocalDate;

@Entity
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
public class FlightEntity {

    @Id
    @GeneratedValue
    private Long id;
    private String code;
    @Column(name = "air_company")
    private Company airCompany;
    @Column(name = "departure_airport")
    private Airport departureAirport;
    @Column(name="arrival_airport")
    private Airport arrivalAirport;
    @Column(name="departure_day")
    private LocalDate departureDay;
    @Column(name="arrival_day")
    private LocalDate arrivalDay;
    private Price price;
    @Column(name="bag_price")
    private Price bagPrice;
    @Column(name="created_date")
    private Instant createdDate;

}
