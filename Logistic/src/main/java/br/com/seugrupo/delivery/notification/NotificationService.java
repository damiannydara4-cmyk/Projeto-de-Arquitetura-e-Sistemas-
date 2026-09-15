package br.com.seugrupo.delivery.notification;

import java.util.List;

public class NotificationService {

    private final List<NotificationChannel> channels;

    public NotificationService(
        List<NotificationChannel> channels
    ) {
        this.channels = List.copyOf(channels);
    }

    public void notify(String message) {
        for (NotificationChannel channel : channels) {
            if (channel.validate()) {
                channel.send(message);
            }
        }
    }
}
