package org.flightsportugal.api.appservice;


import lombok.AllArgsConstructor;
import org.flightsportugal.api.mapper.FlightMapper;

import org.flightsportugal.api.domain.Airport;
import org.flightsportugal.api.domain.Flight;
import org.flightsportugal.api.dto.FlightDTO;
import org.flightsportugal.infrastructure.repository.FlightRepository;


import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;

@ApplicationScoped
public class FlightService {
    @Inject
    FlightRepository repository;
    @Inject
    private FlightMapper mapper;


    public List<FlightDTO> findFlights(Airport.City departure, Airport.City arrival) {
        return mapper.toDTO(
                repository.findFlightsFromTo(
                        departure, arrival),
                getAvgPrice(departure, arrival)
        );
    }

    private double getAvgPrice(Airport.City departure, Airport.City arrival) {

        List<Flight> flights = repository.findFlightsFromTo(departure, arrival);

        double sum = flights.stream()
                .mapToDouble(flight -> flight.getPrice().getValue()).sum();

        return sum / flights.size();
    }
}
