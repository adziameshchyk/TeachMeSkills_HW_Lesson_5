package com.tms.classes_and_objects.additional_tasks.task_2.models.atm;

import java.util.Arrays;

public class ATM {

    public int amount20Bills;
    public int amount50Bills;
    public int amount100Bills;

    public ATM(int amount20Bills, int amount50Bills, int amount100Bills) {
        this.amount20Bills = amount20Bills;
        this.amount50Bills = amount50Bills;
        this.amount100Bills = amount100Bills;
    }

    public void add20Bills(int amount) {
        amount20Bills += amount;
    }

    public void add50Bills(int amount) {
        amount50Bills += amount;
    }

    public void add100Bills(int amount) {
        amount100Bills += amount;
    }

    public boolean tryWithdrawMoney(long amount) {
        if (amount > balance()) {
            System.out.println("There are not enough funds on the balance.");
            return false;
        } else {
            int[] numberBanknotesWhenIssued = getNumberOfBanknotesWhenIssued(amount);
            long amountToWithdrawn = numberBanknotesWhenIssued[0] * 20 + numberBanknotesWhenIssued[1] * 50 + numberBanknotesWhenIssued[2] * 100;

            System.out.println("the amount of " + amountToWithdrawn + " was successfully issued.");
            printBillsToBeIssued(numberBanknotesWhenIssued);

            withdrawMoney(numberBanknotesWhenIssued);
        }
        return true;
    }

    private void withdrawMoney(int[] numberBanknotesWhenIssued) {
        this.amount20Bills -= numberBanknotesWhenIssued[0];
        this.amount50Bills -= numberBanknotesWhenIssued[1];
        this.amount100Bills -= numberBanknotesWhenIssued[2];
    }

    public long balance() {
        long balance = amount20Bills * 20 + amount50Bills * 50 + amount100Bills * 100;
        System.out.println("Current balance: " + balance);
        System.out.println("100 * " + amount100Bills);
        System.out.println("50 * " + amount50Bills);
        System.out.println("20 * " + amount20Bills);
        System.out.println("-----------------------------");
        return balance;
    }

    /**
     * An array of three elements represents the number of banknotes of different denominations.
     * Cell under index 0 corresponds to banknote 20, cell 1 corresponds to 50, cell 2 to 100.
     */
    private int[] getNumberOfBanknotesWhenIssued(long amount) {
        int [] numberOfBanknotes = new int[3];

        if (amount >= 100) {
            numberOfBanknotes[2] = (int) (amount / 100);
            if (amount100Bills >= numberOfBanknotes[2]) {
                amount %= 100;
            } else {
                numberOfBanknotes[2] = amount100Bills;
                amount -= numberOfBanknotes[2] * 100;
            }
        }

        if (amount >= 50) {
            numberOfBanknotes[1] = (int) (amount / 50);
            if (amount50Bills >= numberOfBanknotes[1]) {
                amount %= 50;
            } else {
                numberOfBanknotes[1] = amount50Bills;
                amount -= numberOfBanknotes[1] * 50;
            }
        }

        if (amount >= 20) {
            numberOfBanknotes[0] = (int) (amount / 20);
        }

        return numberOfBanknotes;
    }

    private void printBillsToBeIssued(int[] numberBanknotesWhenIssued) {
        System.out.println("Bills to be issued: ");

        if (numberBanknotesWhenIssued[2] > 0) {
            System.out.println("100 * " + numberBanknotesWhenIssued[2]);
        }
        if (numberBanknotesWhenIssued[1] > 0) {
            System.out.println("50 * " + numberBanknotesWhenIssued[1]);
        }
        if (numberBanknotesWhenIssued[0] > 0) {
            System.out.println("20 * " + numberBanknotesWhenIssued[0]);
        }
        System.out.println("-----------------------------");
    }

}
