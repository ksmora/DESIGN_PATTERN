package com.pattern.design.state;
public class PaymentContext {
    private PaymentState state;

    public PaymentContext() {
        state = new PendingPaymentState();
    }

    public void setState(PaymentState state) {
        this.state = state;
    }

    public void processPayment() {
        state.handlePayment();
    }
}
