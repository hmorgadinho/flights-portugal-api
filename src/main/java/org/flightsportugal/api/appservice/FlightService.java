package org.flightsportugal.api.appservice;


import lombok.AllArgsConstructor;
import org.flightsportugal.api.controller.IFlightService;

import org.flightsportugal.api.domain.Airport;
import org.flightsportugal.api.domain.Flight;
import org.flightsportugal.api.dto.FlightDTO;
import org.flightsportugal.api.infrastructure.repository.FlightRepository;


import javax.enterprise.context.ApplicationScoped;
import java.util.List;

@ApplicationScoped
@AllArgsConstructor
public class FlightService implements IFlightService {

    private FlightRepository repository;
    private IFlightMapper mapper;

    public List<FlightDTO> findFlights(Airport.City departure, Airport.City arrival) {
        return mapper.toDTO(
                repository.getFlightsFromTo(
                        departure, arrival),
                getAvgPrice(departure, arrival)
        );
    }


    private double getAvgPrice(Airport.City departure, Airport.City arrival) {

        List<Flight> flights = repository.getFlightsFromTo(departure, arrival);

        double sum = flights.stream()
                .mapToDouble(flight -> flight.getPrice().getValue()).sum();

        return sum / flights.size();
    }
}
