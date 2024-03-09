package com.tms.classes_and_objects.additional_tasks.task_1.models.computer;

public class HDD {

    public String name;
    public int capacity;
    public String type;

    public HDD() {
    }

    public HDD(String name, int capacity, String type) {
        this.name = name;
        this.capacity = capacity;
        this.type = type;
    }

    @Override
    public String toString() {
        return "HDD{" +
                "name='" + name + '\'' +
                ", capacity=" + capacity +
                ", type='" + type + '\'' +
                '}';
    }

}
