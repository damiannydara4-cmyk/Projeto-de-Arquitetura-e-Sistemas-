package br.com.seugrupo.delivery.order;

public class Seller {

    private final String name;

    public Seller(String name) {
        this.name = name;
    }

    public void approve(Request request) {
        request.approve();
    }

    public String getName() {
        return name;
    }
}