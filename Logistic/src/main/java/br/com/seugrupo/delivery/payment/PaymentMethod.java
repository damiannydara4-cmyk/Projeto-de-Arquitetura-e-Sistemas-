package br.com.seugrupo.delivery.payment;

import java.math.BigDecimal;

public interface PaymentMethod {
    
    boolean pay(BigDecimal amount);

    boolean refund();
}
