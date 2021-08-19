package ooplesson7.homework_lesson7_optional;

import java.util.Scanner;

public class Magazine extends Document{
    private int releaseNumber;
    private int monthRelease;


    public Magazine(String documentCode, String producerName, int amountReleases, int releaseNumber, int monthRelease) {
        super(documentCode, producerName, amountReleases);
        this.releaseNumber = releaseNumber;
        this.monthRelease = monthRelease;
    }

    public Magazine() {

    }

    @Override
    public void inputDocument() {
        super.inputDocument();
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the release number:");
        releaseNumber = input.nextInt();
        System.out.println("Enter the release month: ");
        monthRelease = input.nextInt();
    }

    @Override
    public void printDocument() {
        super.printDocument();
        System.out.print("the release number is: "+releaseNumber
                            +"\nthe release month is:"+monthRelease);
    }

    public int getReleaseNumber() {
        return releaseNumber;
    }

    public int getMonthRelease() {
        return monthRelease;
    }

    public void setReleaseNumber(int releaseNumber) {
        this.releaseNumber = releaseNumber;
    }

    public void setMonthRelease(int monthRelease) {
        this.monthRelease = monthRelease;
    }
}
