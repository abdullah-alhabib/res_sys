/*class CashPayment extends Payment {
    private String receiptNumber;
    private int receiptCounter;

    public CashPayment(double amount, String receiptNumber) {
        super(amount);
        this.receiptNumber = receiptNumber;
        this.receiptCounter = generateReceiptCounter();
    }

    public String getReceiptNumber() {
        return receiptNumber;
    }

    public void setReceiptNumber(int receiptCounter) {
        this.receiptNumber = "R" + receiptCounter;
    }

    private int generateReceiptCounter() {
        Random rand = new Random();
        return rand.nextInt(1000) + 1;
    }
}*/

// Subclasses for Payment
public class CashPayment extends Payment {
    private String receiptNumber;
    private static int receiptCounter = 0;

    public CashPayment(double amount, String receiptNumber) {
        super(amount);
        this.receiptNumber = receiptNumber;
    }

    public String getReceiptNumber() {
        return receiptNumber;
    }

    public void setReceiptNumber(int receiptCounter) {
        this.receiptNumber = "RCPT" + receiptCounter;
    }
}

