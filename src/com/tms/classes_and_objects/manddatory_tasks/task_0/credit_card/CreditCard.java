package com.tms.classes_and_objects.manddatory_tasks.task_0.credit_card;

public class CreditCard {

    public long accountNumber;

    public long balance;

    public CreditCard(long accountNumber, long balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void addMoney(long amount) {
        balance += amount;
        System.out.println("Amount added successfully.");
        checkBalance();
    }

    public void withdrawMoney(long amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("The amount was successfully withdrawn.");
        } else {
            System.out.println("There are not enough funds on the balance.");
        }
        checkBalance();
    }

    public void checkBalance() {
        System.out.println("Current balance: " + balance + ".");
    }
}
