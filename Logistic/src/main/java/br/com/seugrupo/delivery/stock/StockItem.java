package br.com.seugrupo.delivery.stock;

import java.math.BigDecimal;
import java.util.Objects;

public class StockItem {

    private final Integer id;
    private final String name;
    private final BigDecimal price;
    private final String description;

    public StockItem(
            Integer id,
            String name,
            BigDecimal price,
            String description
    ) {
        this.id = id;
        this.name = Objects.requireNonNull(name);
        this.price = Objects.requireNonNull(price);
        this.description = Objects.requireNonNull(description);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof StockItem other)) {
            return false;
        }

        return id.equals(other.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
