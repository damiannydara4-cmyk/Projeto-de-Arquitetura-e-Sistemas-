package br.com.seugrupo.delivery.order;

import br.com.seugrupo.delivery.payment.Payment;
import br.com.seugrupo.delivery.payment.PaymentMethod;

import java.util.UUID;

public class OrderController {

    public Request createRequest(Client client) {
        return client.createRequest();
    }

    public Order submitRequest(
            Request request,
            PaymentMethod method
    ) {
        Order order = request.submit();

        Payment payment = new Payment(
            UUID.randomUUID().toString(),
            method
        );

        boolean paid = payment.process(
            order.calculateTotal()
        );

        if (!paid) {
            throw new IllegalStateException(
                "Payment failed"
            );
        }

        order.authorize();

        return order;
    }
}