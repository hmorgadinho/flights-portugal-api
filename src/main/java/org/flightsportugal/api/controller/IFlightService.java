package org.flightsportugal.api.controller;


import org.flightsportugal.api.domain.Airport;
import org.flightsportugal.api.dto.FlightDTO;

import java.util.List;

public interface IFlightService {
    List<FlightDTO> findFlights(Airport.City departure, Airport.City arrival);

}
