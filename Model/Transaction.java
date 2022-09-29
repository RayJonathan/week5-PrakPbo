package Model;

public class Transaction {
    String transactionID;
    String date;

    public Transaction(String transactionID, String date) {
        this.transactionID = transactionID;
        this.date = date;
    }

    public String getTransactionID() {
        return transactionID;
    }

    public void setTransactionID(String transactionID) {
        this.transactionID = transactionID;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Transaction [date=" + date + ", transactionID=" + transactionID + "]";
    }

}
