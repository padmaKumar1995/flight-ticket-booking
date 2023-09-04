package com.kumar.flightticketbooking.flight.seat;

import com.kumar.flightticketbooking.flight.enums.SeatType;

public class AisleSeat extends Seat {
    private static final int extraCost = 100;

    public AisleSeat() {
        this.type = SeatType.Aisle;
        this.shortName = "A";
    }
}
