package Model;

public class Transfer extends Transaction {
    String destinationNumber;
    double amount;

    public Transfer(String transactionID, String date, String destinationNumber, double amount) {
        super(transactionID, date);
        this.destinationNumber = destinationNumber;
        this.amount = amount;
    }

    public String getDestinationNumber() {
        return destinationNumber;
    }

    public void setDestinationNumber(String destinationNumber) {
        this.destinationNumber = destinationNumber;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Transfer [amount=" + amount + ", destinationNumber=" + destinationNumber + "]";
    }

}
