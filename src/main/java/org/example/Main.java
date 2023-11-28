package org.example;

public class Main {
    public static void main(String[] args) {

        // Singleton Pattern
        ConfigurationManager configManager = ConfigurationManager.getInstance();
        configManager.setApiKey("13124905453949");

        // Observer Pattern
        Order order = new Order();
        Customer customer1 = new Customer("John");
        Customer customer2 = new Customer("Alice");
        order.addObserver(customer1);
        order.addObserver(customer2);

        // Strategy Pattern
        PaymentStrategy creditCardPayment = new CreditPayment();
        PaymentStrategy payPalPayment = new PaypalPayment();

        OrderPaymentContext creditCardContext = new OrderPaymentContext(creditCardPayment);
        OrderPaymentContext payPalContext = new OrderPaymentContext(payPalPayment);

        // Simulate order processing
        order.updateStatus(OrderStatus.PROCESSING);

        // Simulate payment using different strategies
        creditCardContext.processPayment(100.0);
        payPalContext.processPayment(80.0);

        // Retrieve and display API key from configuration
        String apiKey = configManager.getApiKey();
        System.out.println("API Key: " + apiKey);
    }
}