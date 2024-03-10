package com.tms.classes_and_objects.additional_tasks.task_2.runner;

import com.tms.classes_and_objects.additional_tasks.task_2.models.atm.ATM;

/**
 * Task:
 *
 * Create a class that describes an ATM.
 * The set of banknotes in the ATM must be specified by three properties:
 * number of bills in denominations of 20, 50 and 100.
 * Make methods for adding money to an ATM.
 * Make a function that withdraws money, which accepts an amount of money and
 * returns a Boolean value indicating the success of the operation.
 * When withdrawing money, the function should print how many bills of what denomination the amount is issued.
 * Create a constructor with three parameters - the number of banknotes of each denomination.
 */

public class Runner {

    public static void main(String[] args) {
        ATM atm = new ATM(5, 7, 8);

        atm.tryWithdrawMoney(1235);
        atm.balance();
    }

}
