package com.kumar.flightticketbooking.flight.seat;

import com.kumar.flightticketbooking.common.BaseEntity;
import com.kumar.flightticketbooking.flight.Passenger;
import com.kumar.flightticketbooking.flight.enums.SeatType;

public abstract class Seat extends BaseEntity {
    public SeatType type;
    public String shortName;
    public Passenger passengerDetails;
}
