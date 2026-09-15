package br.com.seugrupo.delivery.order;

import java.util.ArrayList;
import java.util.List;

public class Request {

    private final List<OrderItem> items;
    private RequestStatus status;

    public Request() {
        this.items = new ArrayList<>();
        this.status = RequestStatus.CREATED;
    }

    public void addItem(OrderItem item) {
        items.add(item);
    }

    public void approve() {
        status = RequestStatus.APPROVED;
    }

    public Order submit() {
        if (status != RequestStatus.APPROVED) {
            throw new IllegalStateException(
                "Request must be approved before submission"
            );
        }

        status = RequestStatus.SUBMITTED;

        return new Order(items);
    }

    public RequestStatus getStatus() {
        return status;
    }

    public List<OrderItem> getItems() {
        return List.copyOf(items);
    }
}