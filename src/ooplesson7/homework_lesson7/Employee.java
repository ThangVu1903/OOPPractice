package ooplesson7.homework_lesson7;

public class Employee {
    private String name;
    private String gender ;
    private String date;
    private String address;

    public Employee(String name, String gender, String date, String address) {
        this.name = name;
        this.gender = gender;
        this.date = date;
        this.address = address;
    }

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getDate() {
        return date;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
