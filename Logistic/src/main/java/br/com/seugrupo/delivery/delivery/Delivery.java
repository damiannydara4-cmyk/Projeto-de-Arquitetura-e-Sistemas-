package br.com.seugrupo.delivery.delivery;

import br.com.seugrupo.delivery.delivery.vehicle.Vehicle;

import java.util.Objects;

public class Delivery {

    private final String address;
    private DeliveryStatus status;

    private Driver driver;
    private Vehicle vehicle;
    private Route route;

    public Delivery(String address) {
        this.address = Objects.requireNonNull(address);
        this.status = DeliveryStatus.PENDING;
    }

    public void assign(Driver driver) {
        this.driver = Objects.requireNonNull(driver);
        this.status = DeliveryStatus.ASSIGNED;
    }

    public void assignVehicle(Vehicle vehicle) {
        this.vehicle = Objects.requireNonNull(vehicle);
    }

    public void assignRoute(Route route) {
        this.route = Objects.requireNonNull(route);
    }

    public void start() {
        if (driver == null) {
            throw new IllegalStateException(
                "Delivery must have a driver before starting"
            );
        }

        if (vehicle == null) {
            throw new IllegalStateException(
                "Delivery must have a vehicle before starting"
            );
        }

        this.status = DeliveryStatus.IN_TRANSIT;
    }

    public void complete() {
        this.status = DeliveryStatus.DELIVERED;
    }

    public String getAddress() {
        return address;
    }

    public DeliveryStatus getStatus() {
        return status;
    }

    public Driver getDriver() {
        return driver;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public Route getRoute() {
        return route;
    }
}