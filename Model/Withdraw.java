package Model;

public class Withdraw extends Transaction {
    double Amount;

    public Withdraw(String transactionID, String date, double amount) {
        super(transactionID, date);
        Amount = amount;
    }

    public double getAmount() {
        return Amount;
    }

    public void setAmount(double amount) {
        Amount = amount;
    }

    @Override
    public String toString() {
        return "Withdraw [Amount=" + Amount + "]";
    }

}
