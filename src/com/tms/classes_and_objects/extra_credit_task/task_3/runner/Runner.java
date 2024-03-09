package com.tms.classes_and_objects.extra_credit_task.task_3.runner;

import com.tms.classes_and_objects.extra_credit_task.task_3.models.computer.Computer;
import com.tms.classes_and_objects.extra_credit_task.task_3.models.computer.HDD;
import com.tms.classes_and_objects.extra_credit_task.task_3.models.computer.RAM;
import com.tms.classes_and_objects.extra_credit_task.task_3.models.computer.TypeOfComputer;

/**
 * Task:
 *
 * Rewrite the additional task by adding a “type” field to the “computer” class and
 * let this field be Enum (values: laptop or desktop).
 */

public class Runner {

    public static void main(String[] args) {
        Computer computer = new Computer(250, "x", TypeOfComputer.DESKTOP);
        System.out.println(computer);

        Computer computer1 = new Computer(250, "Z", new RAM("ram disk", 16),
                new HDD("hdd disk", 32, "external"), TypeOfComputer.LAPTOP);
        System.out.println(computer1);
    }

}
