
package AbstractionDemo;

abstract class PaymentMethod {

    abstract void processPayment();

    void showReceipt() {
        System.out.println("Payment transaction completed.");
    }
}

class CashPayment extends PaymentMethod {

    @Override
    void processPayment() {
        System.out.println("Processing payment through Cash.");
    }
}

class GCashPayment extends PaymentMethod {

    @Override
    void processPayment() {
        System.out.println("Processing payment through GCash.");
    }
}

public class AbstractionDemo {

    public static void main(String[] args) {

        CashPayment cash = new CashPayment();
        cash.processPayment();
        cash.showReceipt();

        System.out.println();

        GCashPayment gcash = new GCashPayment();
        gcash.processPayment();
        gcash.showReceipt();
    }
}
