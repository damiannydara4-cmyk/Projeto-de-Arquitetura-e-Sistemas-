package br.com.seugrupo.delivery.delivery.vehicle;

import java.math.BigDecimal;
import java.util.Objects;

public abstract class Vehicle {

    protected final String licensePlate;
    protected final BigDecimal maxWeight;

    protected Vehicle(String licensePlate, BigDecimal maxWeight) {
        this.licensePlate = Objects.requireNonNull(licensePlate);
        this.maxWeight = Objects.requireNonNull(maxWeight);
    }

    public abstract boolean canCarry(BigDecimal weight);

    public abstract boolean isAvailable();

    public String getLicensePlate() {
        return licensePlate;
    }

    public BigDecimal getMaxWeight() {
        return maxWeight;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Vehicle other)) {
            return false;
        }

        return licensePlate.equals(other.licensePlate);
    }

    @Override
    public int hashCode() {
        return licensePlate.hashCode();
    }
}