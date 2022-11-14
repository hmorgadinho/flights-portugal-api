package org.flightsportugal.api.infrastructure.repository;

import org.flightsportugal.api.infrastructure.data.FlightEntity;
import org.flightsportugal.api.domain.Flight;

import javax.enterprise.context.ApplicationScoped;
import java.time.Instant;

@ApplicationScoped
public class FlightAssembler {

    FlightEntity toEntity(Flight flight){
        return new FlightEntity(
                flight.getId(),
                flight.getCode(),
                flight.getAirCompany(),
                flight.getDepartureAirport(),
                flight.getArrivalAirport(),
                flight.getDepartureDay(),
                flight.getArrivalDay(),
                flight.getPrice(),
                flight.getBagPrice(),
                Instant.now()
        );
    }

    Flight toDomain(FlightEntity entity){
        return new Flight(
                entity.getId(),
                entity.getCode(),
                entity.getAirCompany(),
                entity.getDepartureAirport(),
                entity.getArrivalAirport(),
                entity.getDepartureDay(),
                entity.getArrivalDay(),
                entity.getPrice(),
                entity.getBagPrice()
        )
    }
}
