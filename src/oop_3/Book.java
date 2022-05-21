/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_3;

/**
 *
 * @author ACER
 */
public class Book extends Document{
    String author;
    int page;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }


    public Book(int ID, String publisher, int numOfCopies, String author, int page) {
        super(ID, publisher, numOfCopies);
        this.author = author;
        this.page = page;
    }

    @Override
    public String toString() {
        return "Book{" + "ID=" + ID + ", publisher=" + publisher + ", numOfCopies=" + numOfCopies + ", author=" + author + ", page=" + page + '}';
    }

    
}
