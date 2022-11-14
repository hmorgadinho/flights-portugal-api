package org.flightsportugal.api.controller;

import org.flightsportugal.api.domain.Airport;
import org.flightsportugal.api.dto.FlightDTO;

import javax.enterprise.context.ApplicationScoped;
import java.util.List;

@ApplicationScoped
public class FlightController {

    private final IFlightService service;

    public FlightController(IFlightService service) {
        this.service = service;
    }

    public List<FlightDTO> getFlights (String departure, String arrival){

        return service.findFlights(

                Airport.City.valueOf(departure.toUpperCase()),
             Airport.City.valueOf(arrival.toUpperCase())
        );
    }

}
