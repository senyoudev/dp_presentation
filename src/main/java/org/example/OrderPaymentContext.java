package org.example;

class OrderPaymentContext {
    private PaymentStrategy paymentStrategy;

    public OrderPaymentContext(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void processPayment(double amount) {
        paymentStrategy.pay(amount);
    }
}