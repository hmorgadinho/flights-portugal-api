package org.flightsportugal.api.appservice;

import org.flightsportugal.api.domain.Airport;
import org.flightsportugal.api.domain.Flight;


import java.util.List;

public interface IFlightRepository {

    List<Flight> getAllFlights(Airport.City departure, Airport.City arrival);

    List<Flight> getFlights();
}
