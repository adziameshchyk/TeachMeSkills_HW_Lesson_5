package com.tms.classes_and_objects.manddatory_tasks.task_0.runner;

import com.tms.classes_and_objects.manddatory_tasks.task_0.credit_card.CreditCard;

/**
 * Task:
 *
 * Create a CreditCard class with the fields account number and current amount in the account.
 * Add a method that allows you to charge the amount to your credit card
 * Add a method that allows you to withdraw a certain amount from the card.
 * Add a method that displays current card information.
 * Write a program that creates three objects of the CreditCard class with the given account number and initial amount.
 * Test script for verification:
 *      -place money on the first two cards and withdraw from the third,
 *      -display the current status of all three cards.
 */

public class Runner {

    public static void main(String[] args) {
        CreditCard creditCard1 = new CreditCard(1231352, 0);
        CreditCard creditCard2 = new CreditCard(1231352332, 100);
        CreditCard creditCard3 = new CreditCard(12, 150);


        creditCard1.addMoney(150);
        creditCard2.addMoney(200);
        creditCard3.withdrawMoney(100);
    }

}
