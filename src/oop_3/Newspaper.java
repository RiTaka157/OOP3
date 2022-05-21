/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_3;

import java.util.Date;

/**
 *
 * @author ACER
 */
public class Newspaper extends Document{
    Date pudDate;

    public Newspaper(int ID, String publisher, int numOfCopies, Date pudDate) {
        super(ID, publisher, numOfCopies);
        this.pudDate = pudDate;
    }

    public Date getPudDate() {
        return pudDate;
    }

    public void setPudDate(Date pudDate) {
        this.pudDate = pudDate;
    }

    @Override
    public String toString() {
        return "Newspaper{"+ "ID=" + ID + ", publisher=" + publisher + ", numOfCopies=" + numOfCopies  + ", pudDate=" +  date.format(pudDate) + '}';
    }
    
    
}
