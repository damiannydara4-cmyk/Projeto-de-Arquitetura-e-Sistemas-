package br.com.seugrupo.delivery.notification.channel;

import br.com.seugrupo.delivery.notification.NotificationChannel;

public class Email implements NotificationChannel{
    
    private final String address;

    public Email(String address) {
        this.address = address;
    }

    @Override 
    public boolean send(String message){
        if (!validate()) {
            return false;
        }
        
        System.out.println("Mensagem enviada do Email: " + address + " / Conteúdo: " + message);
        return true;
    }

    @Override 
    public boolean validate() {
        return address != null
                && !address.isBlank()
                && address.contains("@");
    }
}
