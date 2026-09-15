package br.com.seugrupo.delivery.stock;

import java.util.HashMap;
import java.util.Map;

public class Stock {
    private final Map<StockItem, Integer> items;

    public Stock(){
        this.items = new HashMap<>();
    }

    public void add(StockItem item, int quantity){
        items.merge(item, quantity, Integer::sum);
    }

    public int getQuantity(StockItem item) {
        return items.getOrDefault(item, 0);
    }

    public boolean isAvailable(StockItem item, int quantity) {
        return getQuantity(item) >= quantity;
    }

    public void remove(StockItem item, int quantity) {
        if (!isAvailable(item, quantity)) {
            throw new IllegalStateException("Insufficient stock");
        }

        items.computeIfPresent(
            item,
            (key, currentQuantity) -> currentQuantity - quantity
        );
    }
    
}
