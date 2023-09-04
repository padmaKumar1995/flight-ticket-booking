package com.kumar.flightticketbooking.flight;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

public class FlightsRepo {
    List<Flight> flights = new ArrayList<>();

    public void addFlight(Flight flight) {
        flights.add(flight);
    }

    public List<Flight> getFlights(String source, String destination) {
        return flights.stream()
                .filter(f -> Objects.equals(f.source, source) && Objects.equals(f.destination, destination))
                .collect(Collectors.toList());
    }

    public Optional<Flight> getFlightById(int id) {
        return flights.stream()
                .filter(f -> f.id == id)
                .findFirst();
    }
}
