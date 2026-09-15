package br.com.seugrupo.delivery.order;

public class Client {

    private final String name;

    public Client(String name) {
        this.name = name;
    }

    public Request createRequest() {
        return new Request();
    }

    public String getName() {
        return name;
    }
}