package br.com.seugrupo.delivery.notification;

public interface NotificationChannel {
    
    public boolean send(String message);
    public boolean validate();
}
