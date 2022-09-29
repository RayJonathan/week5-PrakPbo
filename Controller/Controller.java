package Controller;

public class Controller {
    Initialize data = new Initialize();

    public boolean insertCard(String number) {
        boolean exit = false;
        for (int i = 0; i < data.cards.size(); i++) {
            if (number.equals(data.cards.get(i).getCardNumber())) {
                exit = true;
                break;
            }
        }

        return exit;
    }

    public boolean validatePin(String pin, String number) {
        boolean exit = false;
        for (int i = 0; i < data.cards.size(); i++) {
            if (pin.equals(data.cards.get(i).getPin()) && insertCard(number) == true) {
                exit = true;
                break;
            }
        }
        return exit;
    }

    public double checkBalance(String pin, String number) {
        double balance = -1;
        for (int i = 0; i < data.cards.size(); i++) {
            if (data.cards.get(i).getCardNumber().equals(number)) {
                balance = data.cards.get(i).getBalance();
            }
        }
        return balance;
    }

    public boolean withdraw(String pin, String number, double amount, String machineCode) {
        boolean exit = true;
        for (int i = 0; i < data.cards.size(); i++) {
            if (data.cards.get(i).getCardNumber().equals(number) && data.cards.get(i).getPin().equals(pin)) {
                for (int j = 0; j < data.machines.size(); j++) {
                    if (data.machines.get(j).getKodeAtm().equals(machineCode)) {
                        if (data.machines.get(j).getCash() > amount) {
                            if (data.cards.get(i).getBalance() < amount) {
                                System.out.println("Insufficient balance for doing this transaction");
                                exit = false;
                                break;
                            } else {
                                data.cards.get(i).setBalance(data.cards.get(i).getBalance() - amount);
                                System.out.println("SUCCESS, YOUR BALANCE IS : " + data.cards.get(i).getBalance());
                                data.machines.get(j).setCash(data.machines.get(j).getCash() - amount);
                                System.out.println("Cash at machine : " + data.machines.get(j).getCash());
                                exit = true;
                                break;

                            }
                        }
                    }
                }
            }
        }
        return exit;
    }

    public boolean transfer(String pin, String number, double amount, String rekening) {
        boolean exit = true;
        boolean rekeningValidate = false;
        int index = 0;
        for (int i = 0; i < data.cards.size(); i++) {
            if (data.cards.get(i).getCardNumber().equals(rekening)) {
                rekeningValidate = true;
                index = i;
                break;
            }
        }

        for (int i = 0; i < data.cards.size(); i++) {
            if (data.cards.get(i).getCardNumber().equals(number) && data.cards.get(i).getPin().equals(pin)
                    && rekeningValidate == true) {
                if (data.cards.get(i).getBalance() < amount) {
                    System.out.println("Insufficient balance for doing this transaction");
                    exit = false;
                } else {
                    data.cards.get(i).setBalance(data.cards.get(i).getBalance() - amount);
                    System.out.println("SUCCESS, YOUR BALANCE IS : " + data.cards.get(i).getBalance());
                    data.cards.get(index).setBalance(data.cards.get(index).getBalance() + amount);
                    exit = true;
                    System.out.println("Balance ADDED TO user :  " + data.cards.get(index).getBalance());
                    break;
                }

            }
        }
        return exit;
    }
}