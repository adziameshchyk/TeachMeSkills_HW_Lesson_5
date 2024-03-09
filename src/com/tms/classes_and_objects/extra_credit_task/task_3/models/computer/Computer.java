package com.tms.classes_and_objects.extra_credit_task.task_3.models.computer;

public class Computer {

    public int price;
    public String model;
    public RAM ram;
    public HDD hdd;
    public TypeOfComputer type;

    public Computer(int price, String model, TypeOfComputer type) {
        this.price = price;
        this.model = model;
        this.type = type;
        this.ram = new RAM();
        this.hdd = new HDD();
    }

    public Computer(int price, String model, RAM ram, HDD hdd, TypeOfComputer type) {
        this.price = price;
        this.model = model;
        this.ram = ram;
        this.hdd = hdd;
        this.type = type;

    }

    @Override
    public String toString() {
        return "Computer{" +
                "price=" + price +
                ", model='" + model + '\'' +
                ", ram=" + ram +
                ", hdd=" + hdd +
                '}';
    }
}
