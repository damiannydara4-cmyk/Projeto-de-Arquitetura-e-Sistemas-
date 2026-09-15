package br.com.seugrupo.delivery.tracking;

import br.com.seugrupo.delivery.delivery.vehicle.Vehicle;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TrackingService {

    private final Map<Vehicle, List<TrackingEvent>> history =
            new HashMap<>();

    public void track(
            Vehicle vehicle,
            Coordinates position
    ) {
        TrackingEvent event = new TrackingEvent(
                position,
                LocalDateTime.now()
        );

        history
            .computeIfAbsent(
                vehicle,
                ignored -> new ArrayList<>()
            )
            .add(event);
    }

    public Coordinates getCurrentPosition(
            Vehicle vehicle
    ) {
        List<TrackingEvent> events = history.get(vehicle);

        if (events == null || events.isEmpty()) {
            return null;
        }

        return events
                .get(events.size() - 1)
                .getPosition();
    }

    public List<TrackingEvent> getHistory(
            Vehicle vehicle
    ) {
        return List.copyOf(
            history.getOrDefault(
                vehicle,
                List.of()
            )
        );
    }
}