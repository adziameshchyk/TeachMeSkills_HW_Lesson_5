package com.tms.classes_and_objects.additional_tasks.task_1.runner;

import com.tms.classes_and_objects.additional_tasks.task_1.models.computer.Computer;
import com.tms.classes_and_objects.additional_tasks.task_1.models.computer.HDD;
import com.tms.classes_and_objects.additional_tasks.task_1.models.computer.RAM;

public class Runner {

    public static void main(String[] args) {
        Computer computer = new Computer(250, "x");
        System.out.println(computer);

        Computer computer1 = new Computer(250, "Z", new RAM("ram disk", 16), new HDD("hdd disk", 32, "external"));
        System.out.println(computer1);
    }

}
