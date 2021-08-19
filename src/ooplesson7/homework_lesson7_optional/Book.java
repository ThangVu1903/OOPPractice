package ooplesson7.homework_lesson7_optional;

import java.util.Scanner;

public class Book extends Document{
    private String authorName;
    private int numberOfPages;



    public Book(String documentCode, String producerName, int amountReleases, String authorName, int numberOfPages) {
        super(documentCode, producerName, amountReleases);
        this.authorName = authorName;
        this.numberOfPages = numberOfPages;
    }

    public Book() {

    }

    @Override
    public void inputDocument() {
        super.inputDocument();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the author's name: ");
        authorName = input.nextLine();
        System.out.println("enter page number: ");
        numberOfPages = input.nextInt();
    }

    @Override
    public void printDocument() {
        super.printDocument();
        System.out.println("author name is :"+authorName+"\npage number is: "+numberOfPages);
    }

    public String getAuthorName() {
        return authorName;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }



    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }
}
