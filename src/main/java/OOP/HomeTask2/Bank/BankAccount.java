package OOP.HomeTask2.Bank;

import java.util.Observable;

public abstract class BankAccount extends Observable {

    protected double accountBalance;
    protected double withdrawalLimit;
    protected double feePercent;

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
        setChanged();
        notifyObservers(accountBalance);
    }

    public void addMoney(double addAmount) {
        setAccountBalance(accountBalance + addAmount);
    }

    public abstract double withdrawMoney(double withdrawalAmount);

    public double calculateWithdrawalFee(double withdrawalAmount) {

        return withdrawalAmount * feePercent / 100;
    }

}
