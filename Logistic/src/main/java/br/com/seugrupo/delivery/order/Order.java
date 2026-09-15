package br.com.seugrupo.delivery.order;

import java.math.BigDecimal;
import java.util.List;

public class Order {

    private final List<OrderItem> items;
    private OrderStatus status;

    public Order(List<OrderItem> items) {
        this.items = List.copyOf(items);
        this.status = OrderStatus.CREATED;
    }

    public BigDecimal calculateTotal() {
        BigDecimal total = BigDecimal.ZERO;

        for (OrderItem item : items) {
            total = total.add(item.subtotal());
        }

        return total;
    }

    public void authorize() {
        status = OrderStatus.AUTHORIZED;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public List<OrderItem> getItems() {
        return items;
    }
}