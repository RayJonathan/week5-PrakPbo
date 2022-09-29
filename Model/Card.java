package Model;

public class Card extends Account {
    String cardNumber;
    String Pin;

    public Card(String accountNumber, String name, String address, double balance, String cardNumber, String pin) {
        super(accountNumber, name, address, balance);
        this.cardNumber = cardNumber;
        Pin = pin;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getPin() {
        return Pin;
    }

    public void setPin(String pin) {
        Pin = pin;
    }

    @Override
    public String toString() {
        return "Card [Pin=" + Pin + ", cardNumber=" + cardNumber + "]";
    }

}
