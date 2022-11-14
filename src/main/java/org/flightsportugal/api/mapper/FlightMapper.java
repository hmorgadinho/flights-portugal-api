package org.flightsportugal.api.mapper;


import org.flightsportugal.api.appservice.IFlightMapper;
import org.flightsportugal.api.domain.Flight;
import org.flightsportugal.api.dto.FlightDTO;

import java.util.List;
import java.util.stream.Collectors;

public class FlightMapper implements IFlightMapper {

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
