package br.com.seugrupo.delivery.payment;

import java.math.BigDecimal;

public class Payment {

    private final String transactionId;
    private PaymentStatus status;
    private final PaymentMethod method;

    public Payment(
        String transactionId,
        PaymentMethod method
    ) {
        this.transactionId = transactionId;
        this.method = method;
        this.status = PaymentStatus.PENDING;
    }

    public boolean process(BigDecimal amount) {
        boolean success = method.pay(amount);

        if (success) {
            status = PaymentStatus.APPROVED;
        } else {
            status = PaymentStatus.FAILED;
        }

        return success;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public PaymentStatus getStatus() {
        return status;
    }
}