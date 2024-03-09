package com.tms.classes_and_objects.additional_tasks.task_1.models.computer;

public class RAM {

    public String name;
    public int capacity;

    public RAM() {
    }

    public RAM(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "RAM{" +
                "name='" + name + '\'' +
                ", capacity=" + capacity +
                '}';
    }

}
