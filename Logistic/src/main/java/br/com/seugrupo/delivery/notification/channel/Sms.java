package br.com.seugrupo.delivery.notification.channel;

import br.com.seugrupo.delivery.notification.NotificationChannel;

public class Sms implements NotificationChannel{
    
    private final String phoneNumber;

    
    public Sms(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    @Override
    public boolean validate() {
        return phoneNumber != null
                && phoneNumber.matches("\\d{10,13}");
    }

    @Override
    public boolean send(String message) {
        if (!validate()) {
            return false;
        }

        System.out.println("SMS enviada do Número: " + phoneNumber + "/ Conteúdo:" + message);

        return true;
    }

}
