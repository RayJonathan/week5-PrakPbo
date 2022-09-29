package View;

import Controller.*;

public class MainMenu {
    Controller cont = new Controller();

    public MainMenu() {
        String cardNumber = "001";
        String pin = "753214";
        System.out.println("MASUKAN KARTU : ");
        System.out.println(cardNumber);
        System.out.println("MASUKAN PIN : ");
        System.out.println(pin);
        System.out.println("STATUS : " + cont.validatePin(pin, cardNumber));
        System.out.println("=======================");
        System.out.println("CHECK SALDO : ");
        System.out.println(cont.checkBalance(pin, cardNumber));
        System.out.println("=======================");
        System.out.println("Withdraw Uang");
        cont.withdraw(pin, cardNumber, 5000, "001");
        System.out.println("=======================");
        System.out.println("Transfer Uang : ");
        cont.transfer(pin, cardNumber, 25000, "002");
        System.out.println("Eject Card");

    }
}
