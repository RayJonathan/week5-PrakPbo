package Model;

public class Account {
    String accountNumber;
    String Name;
    String Address;
    double balance;

    public Account(String accountNumber, String name, String address, double balance) {
        this.accountNumber = accountNumber;
        Name = name;
        Address = address;
        this.balance = balance;
    }

    public String getaccountNumber() {
        return accountNumber;
    }

    public void setaccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account [Address=" + Address + ", Name=" + Name + ", accountNumber=" + accountNumber + ", balance="
                + balance + "]";
    }

}
