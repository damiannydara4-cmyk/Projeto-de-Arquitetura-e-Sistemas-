package br.com.seugrupo.delivery.payment.method;

import java.math.BigDecimal;

import br.com.seugrupo.delivery.payment.PaymentMethod;

public class Pix implements PaymentMethod{

    private final String transactionId;
    
    public Pix(String transactionId){
        this.transactionId = transactionId;

    }

    @Override
    public boolean pay(BigDecimal amount){
        System.out.println("Pagamento Pix de R$: " + amount);
        return true;
    }

    @Override
    public boolean refund() {
        System.out.println(
            "Estornando PIX " + transactionId
        );

        return true;
    }
}