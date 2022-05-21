/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_3;

import java.util.ArrayList;

/**
 *
 * @author ACER
 */
public class BookManagement {

    ArrayList<Document> document;
    ArrayList<Document> a = new ArrayList<>();
    public BookManagement() {
        this.document = new ArrayList<>();
    }

    void addBook(Document doc) {
        this.document.add(doc);
        System.out.println("Add book successful");

    }

    boolean isIDExits(int ID) {
        for (Document document1 : document) {
            if (document1.getID() == ID) {
                return true;
            }
        }
        return false;
    }

    boolean deleteBook(int ID) {
        for (Document document1 : document) {
            if (document1.getID() == ID) {
                document.remove(document1);
                System.out.println("Delete successful");
                return true;
            }
        }

        return false;
    }

    void showBook() {
        for (Document doc : document) {
            System.out.println(doc);
        }

    }
    ArrayList<Document> findBook(int func) {
        a.clear();
        for (Document doc : document) {
            if (doc instanceof Newspaper && (func == 3)) {
                a.add(doc);
            }
            if (doc instanceof Magazine && (func == 2)) {
                a.add(doc);
            }
            if (doc instanceof Book && (func == 1)) {
                a.add(doc);
            }
        }
        return a;
    
    }

}
