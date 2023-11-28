class CreditCardPayment extends Payment {
    private String cardNumber;
    private String expireDate;

    public CreditCardPayment(double amount, String cardNumber, String expireDate) {
        super(amount);
        this.cardNumber = cardNumber;
        this.expireDate = expireDate;
    }

    public boolean verifyCard() {
        // Logic to verify the credit card
        return true;
    }
}





