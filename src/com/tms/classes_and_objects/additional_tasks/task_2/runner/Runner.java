package com.tms.classes_and_objects.additional_tasks.task_2.runner;

import com.tms.classes_and_objects.additional_tasks.task_2.models.atm.ATM;

public class Runner {

    public static void main(String[] args) {
        ATM atm = new ATM(764, 10, 300);

        atm.tryWithdrawMoney(5172);
        atm.balance();
    }

}
