package com.kumar.flightticketbooking.ticket;

import com.kumar.flightticketbooking.common.BaseEntity;
import com.kumar.flightticketbooking.flight.Flight;
import com.kumar.flightticketbooking.flight.seat.Seat;

import java.util.List;

public class Ticket extends BaseEntity {
    private static final int ID_COUNTER = 0;
    public Flight flight;
    public int totalCost;
    public List<String> passengers;
    public List<Seat> seats;

    public Ticket(Flight flight, int totalCost, List<String> passengers, List<Seat> seats) {
        this.flight = flight;
        this.totalCost = totalCost;
        this.passengers = passengers;
        this.seats = seats;
    }
}
