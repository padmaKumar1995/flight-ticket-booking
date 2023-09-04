package com.kumar.flightticketbooking.flight;

import com.kumar.flightticketbooking.common.BaseEntity;

public class Flight extends BaseEntity {
    private static final int ID_COUNTER = 0;
    public String name;
    public String source;
    public String destination;
    public BusinessClass businessClass;
    public EconomyClass economyClass;

    public Flight(String name, String source, String destination, BusinessClass businessClass, EconomyClass economyClass) {
        this.name = name;
        this.source = source;
        this.destination = destination;
        this.businessClass = businessClass;
        this.economyClass = economyClass;
    }
}
