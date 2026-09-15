package br.com.seugrupo.delivery.payment.method;

import java.math.BigDecimal;

import br.com.seugrupo.delivery.payment.PaymentMethod;

public class Cash implements PaymentMethod{
    
    private final String transactionId;
    
    public Cash(String transactionId){
        this.transactionId = transactionId;

    }

    @Override
    public boolean pay(BigDecimal amount){
        System.out.println("Pagamento em dinheiro de R$: " + amount);
        return true;
    }

    @Override
    public boolean refund() {
        System.out.println(
            "Estornando dinheiro " + transactionId
        );

        return true;
    }
}
