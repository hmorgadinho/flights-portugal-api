package org.flightsportugal.api.infrastructure.repository;


import org.flightsportugal.api.domain.Airport;
import org.flightsportugal.api.domain.Flight;
import org.flightsportugal.api.infrastructure.data.FlightEntity;

import javax.enterprise.context.ApplicationScoped;
import java.util.List;
import java.util.stream.Collectors;

@ApplicationScoped
public class FlightRepository {

    private PanacheFlightRepository panacheRepository;
    private FlightAssembler assembler;



    public List<Flight> getFlightsFromTo(Airport.City departure, Airport.City arrival) {
        List<FlightEntity> flights = panacheRepository.findFlightsFromTo(departure, arrival);
        return flights
                .stream()
                .map(flight -> assembler.toDomain(flight))
                .collect(Collectors.toList());
    }

    public List<Flight> getAllFlights() {
        List<FlightEntity> flights = panacheRepository.listAll();
        return flights
                .stream()
                .map(flight -> assembler.toDomain(flight))
                .collect(Collectors.toList());
    }
}
