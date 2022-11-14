package org.flightsportugal.api.infrastructure.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import org.flightsportugal.api.domain.Airport;
import org.flightsportugal.api.infrastructure.data.FlightEntity;

import java.util.List;


public class PanacheFlightRepository implements PanacheRepository <FlightEntity> {

    List<FlightEntity> findFlightsFromTo(Airport.City departure, Airport.City arrival){
        return list("departure_airport=?1 and arrival_airport=2?", departure, arrival);
    }
}
