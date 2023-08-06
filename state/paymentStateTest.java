package com.pattern.design.state;
public class StatePatternExample {
    public static void main(String[] args) {
        PaymentContext paymentContext = new PaymentContext();

        // Pembayaran sedang menunggu konfirmasi
        paymentContext.processPayment();

        // Ubah status pembayaran menjadi berhasil
        paymentContext.setState(new SuccessPaymentState());
        paymentContext.processPayment();

        // Ubah status pembayaran menjadi gagal
        paymentContext.setState(new FailedPaymentState());
        paymentContext.processPayment();
    }
}


//hasil
// Pembayaran sedang menunggu konfirmasi.
// Pembayaran berhasil.
// Pembayaran gagal.
