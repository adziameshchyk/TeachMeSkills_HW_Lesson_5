package com.tms.classes_and_objects.additional_tasks.task_1.runner;

import com.tms.classes_and_objects.additional_tasks.task_1.models.computer.Computer;
import com.tms.classes_and_objects.additional_tasks.task_1.models.computer.HDD;
import com.tms.classes_and_objects.additional_tasks.task_1.models.computer.RAM;

/**
 * Task:
 *
 * Create a class to describe a computer; this class should contain the following fields: cost, model (string type), RAM and HDD.
 * You should create your own classes for the RAM and HDD fields.
 * Classes for RAM and HDD must have a default constructor and a constructor with all parameters.
 * The RAM class has fields "name" and "volume".
 * The HDD class has the fields "name", "volume" and "type" (external or internal).
 * The Computer class must have two constructors:
 *      -the first one - with the parameters cost and model,
 *      -second - with all fields.
 * When creating a "computer" object using the first constructor, the RAM and HDD fields must be created using the default constructors. In each of the classes, provide methods for displaying complete information (displaying all fields and all values). Test script for verification:
 *      -create the object “computer 1” using the first constructor and display the information on the screen,
 *      -create the object “computer 2” using the second constructor and display the information on the screen.
 */

public class Runner {

    public static void main(String[] args) {
        Computer computer = new Computer(250, "x");
        System.out.println(computer);

        Computer computer1 = new Computer(250, "Z", new RAM("ram disk", 16), new HDD("hdd disk", 32, "external"));
        System.out.println(computer1);
    }

}
