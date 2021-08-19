package ooplesson7.homework_lesson7;

public class Worker extends Employee {
    private String factory;

    public Worker(String name, String gender, String date, String address, String factory) {
        super(name, gender, date, address);
        this.factory = factory;
    }

    public Worker() {

    }
    public String getFactory() {
        return factory;
    }

    public void setFactory(String factory) {
        this.factory = factory;
    }
}

