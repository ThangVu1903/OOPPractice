package ooplesson7.homework_lesson7_optional;

import java.util.Scanner;

public class Document {
    private String documentCode ;
    private String producerName;
    private int amountReleases;

    public Document() {
    }

    public Document(String documentCode, String producerName, int amountReleases) {
        this.documentCode = documentCode;
        this.producerName = producerName;
        this.amountReleases = amountReleases;
    }
    public void inputDocument(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the code at Document: ");
        documentCode = input.nextLine();
        System.out.println("Enter the publisher name: ");
        producerName = input.nextLine();
        System.out.println("Enter the number of releases: ");
        amountReleases = input.nextInt();
    }

    public void printDocument(){
        System.out.print("Document code: "+documentCode+"\nimprint: "+producerName
        +"\nnumber of release:  "+amountReleases );
    }


    public String getDocumentCode() {
        return documentCode;
    }

    public String getProducerName() {
        return producerName;
    }

    public int getAmountReleases() {
        return amountReleases;
    }

    public void setDocumentCode(String documentCode) {
        this.documentCode = documentCode;
    }

    public void setProducerName(String producerName) {
        this.producerName = producerName;
    }

    public void setAmountReleases(int amountReleases) {
        this.amountReleases = amountReleases;
    }
}
