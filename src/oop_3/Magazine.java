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
public class Magazine extends Document{
    Date datePublic;
    int numPublic;

    public Magazine(int ID, String publisher, int numOfCopies, Date datePublic, int numPublic) {
        super(ID, publisher, numOfCopies);
        this.datePublic = datePublic;
        this.numPublic = numPublic;
    }

    public Date getDatePublic() {
        return datePublic;
    }

    public void setDatePublic(Date datePublic) {
        this.datePublic = datePublic;
    }

    public int getNumPublic() {
        return numPublic;
    }

    public void setNumPublic(int umPublic) {
        this.numPublic = umPublic;
    }

    @Override
    public String toString() {
        return "Magazine{" + "ID=" + ID + ", publisher=" + publisher + ", numOfCopies=" + numOfCopies + ", datePublic=" + date.format(datePublic) + ", numPublic=" + numPublic + '}';
    }
    
}
