public class Main {
    public static void main(String[] args) {
        Payment creditCard = new CreditCardPayment();
        // TODO: repeate for other 2
        Payment paypal = new CreditCardPayment();
        Payment bankTramsfer = new CreditCardPayment();

        processPayment(creditCard, 150.0);
        // TODO: repeat for paypal at 200.50
        processPayment(paypal, 200.0);
        // TODO: repeat for bankTransfer at 1000.0
        processPayment(bankTramsfer, 1000);
    }

    public static void processPayment(Payment paymentMethod, double amount){
        paymentMethod.processPayment(amount);
    }
}

