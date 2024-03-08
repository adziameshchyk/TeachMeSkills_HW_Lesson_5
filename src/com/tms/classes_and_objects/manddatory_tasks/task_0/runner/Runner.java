package com.tms.classes_and_objects.manddatory_tasks.task_0.runner;

import com.tms.classes_and_objects.manddatory_tasks.task_0.credit_card.CreditCard;

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
