package ooplesson7.homework_lesson7;

public class Main {
    public static void main(String[] args) {
        Employee thang = new Employee();
        thang.setName("Vu Dinh Thang");
        thang.setDate("19/03/2002");
        thang.setAddress("Hai Duong");
        thang.setGender("nam");


        String name = thang.getName();
        String date = thang.getDate();
        String address = thang.getAddress();
        String gender = thang.getGender();
        System.out.println("name: "+name);
        System.out.println("date: "+date);
        System.out.println("address: "+address);
        System.out.println("gender: "+gender);
    }
}
