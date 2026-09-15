package br.com.seugrupo.delivery.delivery;

import java.util.Objects;

public class Driver {
    private final String licenseNumber;

    public Driver(String licenseNumber) {
        this.licenseNumber = Objects.requireNonNull(licenseNumber);
    }

    public void accept(Delivery delivery) {
        Objects.requireNonNull(delivery);

        delivery.assign(this);
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }
}
