package Model;

import java.util.ArrayList;

public class Machine {
    private String kodeAtm;
    private Double cash;
    private ActiveEnum status;
    ArrayList<Withdraw> withdrawsHistory = new ArrayList<>();
    ArrayList<Transfer> transferHistory = new ArrayList<>();

    public Machine(String kodeAtm, Double cash, ActiveEnum status, ArrayList<Withdraw> withdrawsHistory,
            ArrayList<Transfer> transferHistory) {
        this.kodeAtm = kodeAtm;
        this.cash = cash;
        this.status = status;
        this.withdrawsHistory = withdrawsHistory;
        this.transferHistory = transferHistory;
    }

    public String getKodeAtm() {
        return kodeAtm;
    }

    public void setKodeAtm(String kodeAtm) {
        this.kodeAtm = kodeAtm;
    }

    public Double getCash() {
        return cash;
    }

    public void setCash(Double cash) {
        this.cash = cash;
    }

    public ActiveEnum getStatus() {
        return status;
    }

    public void setStatus(ActiveEnum status) {
        this.status = status;
    }

    public ArrayList<Withdraw> getWithdrawsHistory() {
        return withdrawsHistory;
    }

    public void setWithdrawsHistory(ArrayList<Withdraw> withdrawsHistory) {
        this.withdrawsHistory = withdrawsHistory;
    }

    public ArrayList<Transfer> getTransferHistory() {
        return transferHistory;
    }

    public void setTransferHistory(ArrayList<Transfer> transferHistory) {
        this.transferHistory = transferHistory;
    }

    @Override
    public String toString() {
        return "Machine [cash=" + cash + ", kodeAtm=" + kodeAtm + ", status=" + status + ", transferHistory="
                + transferHistory + ", withdrawsHistory=" + withdrawsHistory + "]";
    }

}
