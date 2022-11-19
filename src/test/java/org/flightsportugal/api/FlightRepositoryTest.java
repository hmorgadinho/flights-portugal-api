package org.flightsportugal.api;

import io.quarkus.test.TestTransaction;
import io.quarkus.test.junit.QuarkusTest;
import org.flightsportugal.api.domain.Airport;
import org.flightsportugal.api.domain.Company;
import org.flightsportugal.api.domain.Flight;
import org.flightsportugal.api.domain.Price;
import org.flightsportugal.infrastructure.repository.FlightRepository;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;
import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@QuarkusTest
public class FlightRepositoryTest {

    @Inject
    FlightRepository repository;



    @Test
    @TestTransaction
    void shouldPersistAndReturnFLightFromLisbonToPorto(){

        Company company = new Company(
                "RYN",
                Company.CompanyName.RYANAIR,
                "Ireland"
        );

        Airport departure = new Airport(
                "LIS",
                "Portela",
                Airport.City.LISBON,
                "Portugal"
        );

        Airport arrival = new Airport(
                "OPO",
                "Sá Carneiro",
                Airport.City.PORTO,
                "Portugal"
        );

        Price flightPrice = new Price(
                23.99,
                Price.Currency.EUR
        );

        Price bagPrice = new Price(
                10.99,
                Price.Currency.EUR
        );

        Flight flight = new Flight(
                "OPO356",
                company,
                departure,
                arrival,
                LocalDate.now(),
                LocalDate.now(),
                flightPrice,
                bagPrice

        );

        repository.persist(flight);
        assertTrue(repository.isPersistent(flight));
        assertNotNull(flight.getId());

        List<Flight> result = repository.findFlightsFromTo(Airport.City.LISBON, Airport.City.PORTO);
        assertNotNull(result);
        assertEquals(result.size(), 1);

    }
}
