package com.kumar.flightticketbooking.ticket;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TicketsRepo {
    List<Ticket> tickets = new ArrayList<>();

    public void addTicket(Ticket ticket) {
        tickets.add(ticket);
    }

    public Optional<Ticket> getTicketById(int id) {
        return tickets.stream()
                .filter(t -> t.id == id)
                .findFirst();
    }
}
