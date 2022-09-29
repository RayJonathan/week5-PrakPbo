package Controller;

import Model.*;

import java.util.ArrayList;
import java.util.LinkedList;

public class Initialize {
    ArrayList<Card> cards = new ArrayList<>();
    ArrayList<Withdraw> withdraws = new ArrayList<>();
    ArrayList<Transfer> transfers = new ArrayList<>();
    LinkedList<Machine> machines = new LinkedList<>();

    public Initialize() {

        // inisialisasi kartu
        cards.add(new Card("001", "Ray Jonathan", "Taman Kopo Indah 2 F3 no 9", 50000, "001", "753214"));
        cards.add(new Card("002", "Chelsea", "Taman Kopo 2", 100000, "002", "123456"));
        cards.add(new Card("003", "Arash Buana", "Desa Padepokan", 15000, "003", "789456"));

        // inisialisisasi transaksi
        withdraws.add(new Withdraw("001", "01/01/2022", 800));
        withdraws.add(new Withdraw("002", "01/01/2022", 300));
        withdraws.add(new Withdraw("003", "01/01/2022", 500));

        transfers.add(new Transfer("001", "01/01/2022", "001", 20000));
        transfers.add(new Transfer("002", "02/01/2022", "002", 2000));
        transfers.add(new Transfer("003", "03/01/2022", "001", 13000));

        machines.add(new Machine("001", 150000.0, ActiveEnum.ACTIVE, withdraws, transfers));
        machines.add(new Machine("002", 150000.0, ActiveEnum.INACTIVE, withdraws, transfers));
        machines.add(new Machine("003", 150000.0, ActiveEnum.ACTIVE, withdraws, transfers));

    }

    public void PrintData() {
        cards.get(0).toString();
    }
}
