package OOP.HomeTask1.Bank2;

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

    public void addMoney(double addAmount) throws RuntimeException {
        setAccountBalance(accountBalance + addAmount);
        if (addAmount <= 0) {
            throw new RuntimeException("You are going to replenish the account with a negative value.");
        }
    }

    public abstract double withdrawMoney(double withdrawalAmount);

    public double calculateWithdrawalFee(double withdrawalAmount) {

        return withdrawalAmount * feePercent / 100;
    }

}
