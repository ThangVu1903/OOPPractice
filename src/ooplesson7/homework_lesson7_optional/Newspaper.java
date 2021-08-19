package ooplesson7.homework_lesson7_optional;

import java.util.Scanner;

public class Newspaper extends Document{
    private int releaseDay;



    public Newspaper(String documentCode, String producerName, int amountReleases, int releaseDay) {
        super(documentCode, producerName, amountReleases);
        this.releaseDay = releaseDay;
    }

    public Newspaper() {

    }

    @Override
    public void inputDocument() {
        super.inputDocument();
        Scanner input=new Scanner(System.in);
        System.out.println("enter release day: ");
        releaseDay = input.nextInt();
    }

    @Override
    public void printDocument() {
        super.printDocument();
        System.out.println("the release day is :"+releaseDay);
    }

    public int getReleaseDay() {
        return releaseDay;
    }

    public void setReleaseDay(int releaseDay) {
        this.releaseDay = releaseDay;
    }
}
