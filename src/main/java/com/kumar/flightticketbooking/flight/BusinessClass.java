package com.kumar.flightticketbooking.flight;

import com.kumar.flightticketbooking.flight.seat.Seat;

import java.util.List;

public class BusinessClass {
    private int basePrice = 2000;

    public int noOfSeats;
    public int noOfSeatsInFirstSection;
    public int noOfSeatsInSecondSection;
    public int noOfSeatsInThirdSection;
    public List<Seat> seats;

    public BusinessClass(int noOfSeats, int noOfSeatsInFirstSection, int noOfSeatsInSecondSection, int noOfSeatsInThirdSection) {
        this.noOfSeats = noOfSeats;
        this.noOfSeatsInFirstSection = noOfSeatsInFirstSection;
        this.noOfSeatsInSecondSection = noOfSeatsInSecondSection;
        this.noOfSeatsInThirdSection = noOfSeatsInThirdSection;

        this.calculateSeatArrangements();
    }

    private void calculateSeatArrangements() {

    }
}
