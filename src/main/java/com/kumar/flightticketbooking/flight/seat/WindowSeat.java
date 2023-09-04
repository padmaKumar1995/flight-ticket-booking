package com.kumar.flightticketbooking.flight.seat;

import com.kumar.flightticketbooking.flight.enums.SeatType;
import com.kumar.flightticketbooking.flight.seat.Seat;

public class WindowSeat extends Seat {
    private static final int extraCost = 100;

    public WindowSeat() {
        this.type = SeatType.Window;
        this.shortName = "W";
    }
}
