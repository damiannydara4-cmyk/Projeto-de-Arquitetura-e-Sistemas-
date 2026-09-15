package br.com.seugrupo.delivery.delivery.vehicle;

import java.math.BigDecimal;

public class Car extends Vehicle {

    public Car(String licensePlate, BigDecimal maxWeight){
        super(licensePlate, maxWeight);
    }

    @Override
    public boolean canCarry(BigDecimal weight) {
        return weight.compareTo(maxWeight) <= 0;
    }

    @Override
    public boolean isAvailable() {
        return true;
    }
}