package org.flightsportugal.api.appservice;


import org.flightsportugal.api.domain.Flight;
import org.flightsportugal.api.dto.FlightDTO;

import java.util.List;

public interface IFlightMapper {

    List<FlightDTO> toDTO(List<Flight> flights, double avgPrice);
}
