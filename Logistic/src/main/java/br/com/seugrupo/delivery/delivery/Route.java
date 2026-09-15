package br.com.seugrupo.delivery.delivery;

import java.math.BigDecimal;
import java.util.Objects;

public final class Route {

    private final BigDecimal distanceKm;

    public Route(BigDecimal distanceKm) {
        Objects.requireNonNull(distanceKm);

        if (distanceKm.signum() < 0) {
            throw new IllegalArgumentException(
                "Distance cannot be negative"
            );
        }

        this.distanceKm = distanceKm;
    }

    public BigDecimal getDistance() {
        return distanceKm;
    }
}