package br.com.seugrupo.delivery.payment.method;

import java.math.BigDecimal;
import br.com.seugrupo.delivery.payment.PaymentMethod;


public class Card implements PaymentMethod {

    private final String transactionId;
    
    public Card(String transactionId){
        this.transactionId = transactionId;

    }

    @Override
    public boolean pay(BigDecimal amount){
        System.out.println("Pagamento Cartão de R$: " + amount);
        return true;
    }

    @Override
    public boolean refund() {
        System.out.println(
            "Estornando Cartão " + transactionId
        );

        return true;
    }
}
