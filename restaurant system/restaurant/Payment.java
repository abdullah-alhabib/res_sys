/* class Payment extends RestaurantSystem {
    private double amount;

    public Payment() {
        // Default constructor
    }

    public Payment(double amount) {
        this.amount = amount;
    }

    public boolean confirmPayment() {
        // Logic to confirm payment
        return true;
    }

    @Override
    public String toString() {
        return "Payment [amount=" + amount + "]";
    }

    public double computeTax() {
        // Compute tax logic
        return 0.0;
    }

    public String paymentMethod() {
        return "Payment Method";
    }
} */


public class Payment {
    private double amount; //  احس الصح يكون protected

    public Payment() {
    }

    public Payment(double amount) {
        this.amount = amount;
    }

    public boolean confirmPayment() {
        return true;
    }

    @Override
    public String toString() {
        return "Payment: " + amount;
    }
    public double computeTax() {
        return 0.0;
    }

    public String paymentMethode() {
        return "Payment Method";
    }
}
