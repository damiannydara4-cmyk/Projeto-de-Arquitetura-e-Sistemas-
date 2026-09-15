package br.com.seugrupo.delivery.tracking;

import java.time.LocalDateTime;

public final class TrackingEvent {

    private final Coordinates position;
    private final LocalDateTime occurredAt;

    public TrackingEvent(
            Coordinates position,
            LocalDateTime occurredAt
    ) {
        this.position = position;
        this.occurredAt = occurredAt;
    }

    public Coordinates getPosition() {
        return position;
    }

    public LocalDateTime getOccurredAt() {
        return occurredAt;
    }
}