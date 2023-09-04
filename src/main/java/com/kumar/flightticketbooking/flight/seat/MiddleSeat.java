package com.kumar.flightticketbooking.flight.seat;

import com.kumar.flightticketbooking.flight.enums.SeatType;
import com.kumar.flightticketbooking.flight.seat.Seat;

public class MiddleSeat extends Seat {

    public MiddleSeat() {
        this.type = SeatType.Middle;
        this.shortName = "M";
    }
}
