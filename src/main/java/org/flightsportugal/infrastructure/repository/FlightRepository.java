package org.flightsportugal.infrastructure.repository;


import io.quarkus.hibernate.orm.panache.PanacheRepository;
import org.flightsportugal.api.domain.Airport;
import org.flightsportugal.api.domain.Flight;

import javax.enterprise.context.ApplicationScoped;
import java.util.List;

@ApplicationScoped
public class FlightRepository implements PanacheRepository<Flight> {
    public List<Flight> findFlightsFromTo(Airport.City departure, Airport.City arrival) {
        return list("departure_airport=?1 and arrival_airport=2?", departure, arrival);
    }
}
