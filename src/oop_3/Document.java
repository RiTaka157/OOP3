/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_3;

import java.text.SimpleDateFormat;

/**
 *
 * @author ACER
 */
public class Document {
    int ID;
    String publisher;
    int numOfCopies;
    SimpleDateFormat date = new SimpleDateFormat("dd-MM-yyyy");

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getNumOfCopies() {
        return numOfCopies;
    }

    public void setNumOfCopies(int numOfCopies) {
        this.numOfCopies = numOfCopies;
    }

    public Document(int ID, String publisher, int numOfCopies) {
        this.ID = ID;
        this.publisher = publisher;
        this.numOfCopies = numOfCopies;
    }

    @Override
    public String toString() {
        return "Document{" + "ID=" + ID + ", publisher=" + publisher + ", numOfCopies=" + numOfCopies + '}';
    }
    
}
