package org.flightsportugal.infrastructure.controller;

import org.flightsportugal.api.appservice.FlightService;
import org.flightsportugal.api.domain.Airport;
import org.flightsportugal.api.dto.FlightDTO;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;

@ApplicationScoped
public class FlightController {

    @Inject
    private FlightService service;

    public List<FlightDTO> getFlights (String departure, String arrival){

        return service.findFlights(
                Airport.City.valueOf(departure.toUpperCase()),
                Airport.City.valueOf(arrival.toUpperCase())
        );
    }

}
