package org.flightsportugal.api.mapper;


import org.flightsportugal.api.domain.Flight;
import org.flightsportugal.api.dto.FlightDTO;

import javax.enterprise.context.ApplicationScoped;
import java.util.List;
import java.util.stream.Collectors;

@ApplicationScoped
public class FlightMapper {

    public List<FlightDTO> toDTO(List<Flight> flights, double avgPrice) {
        return flights.stream()
                .map(flight -> new FlightDTO(
                        flight.getCode(),
                        flight.getAirCompany(),
                        flight.getDepartureAirport(),
                        flight.getArrivalAirport(),
                        flight.getDepartureDay(),
                        flight.getArrivalDay(),
                        flight.getPrice(),
                        flight.getBagPrice(),
                        avgPrice
                )).collect(Collectors.toList());
    }
}
