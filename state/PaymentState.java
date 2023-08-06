package com.pattern.design.state;
public class PendingPaymentState implements PaymentState {
    @Override
    public void handlePayment() {
        System.out.println("Pembayaran sedang menunggu konfirmasi.");
    }
}

public class SuccessPaymentState implements PaymentState {
    @Override
    public void handlePayment() {
        System.out.println("Pembayaran berhasil.");
    }
}

public class FailedPaymentState implements PaymentState {
    @Override
    public void handlePayment() {
        System.out.println("Pembayaran gagal.");
    }
}
