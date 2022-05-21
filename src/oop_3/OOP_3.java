/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_3;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class OOP_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SimpleDateFormat sm = new SimpleDateFormat("dd-MM-yyyy");
        sm.setLenient(false);
        BookManagement bm = new BookManagement();
        Scanner cin = new Scanner(System.in);
        int func = 0;
        do {
            System.out.println("----------- Book Management -----------");
            System.out.println("1. Add new book.");
            System.out.println("2. Delete book.");
            System.out.println("3. Show library.");
            System.out.println("4. Find book.");
            System.out.println("5. Exit.");
            boolean isCheckValid = true;
            do {
                isCheckValid = true;
                try {
                    System.out.println("Choose an option: ");
                    func = Integer.parseInt(cin.nextLine());
                    if (func < 1 || func > 5) {
                        isCheckValid = false;
                    }
                } catch (NumberFormatException exception) {
                    isCheckValid = false;
                }
                if (isCheckValid == false) {
                    System.out.println("Option is not valid");
                }
            } while (isCheckValid == false);
            switch (func) {
                case 1:
                    System.out.println("--------------- Add new book ---------------");
                    System.out.println("1. Add new book.");
                    System.out.println("2. Add new Magazine.");
                    System.out.println("3. Add new Newspaper.");
                    do {
                        isCheckValid = true;
                        try {
                            System.out.print("Choose an option: ");
                            func = Integer.parseInt(cin.nextLine());
                            if (func < 1 || func > 3) {
                                isCheckValid = false;
                            }
                        } catch (NumberFormatException exception) {
                            isCheckValid = false;
                        }
                        if (isCheckValid == false) {
                            System.out.println("Option is not valid");
                        }
                    } while (isCheckValid == false);
                    String publisher = "",
                     author = "";
                    int ID = 0,
                     numOfCopies = 0,
                     numPublic = 0,
                     page = 0;
                    Date datePublic = null;
                    do {
                        isCheckValid = true;
                        try {
                            System.out.print("Enter ID: ");
                            ID = Integer.parseInt(cin.nextLine());
                            if (ID < 1) {
                                isCheckValid = false;
                            } else if (bm.isIDExits(ID) == true) {
                                System.out.print("ID is existed,");
                                isCheckValid = false;
                            }
                        } catch (NumberFormatException exception) {
                            isCheckValid = false;
                        }
                        if (isCheckValid == false) {
                            System.out.println("ID is not valid");
                        }
                    } while (isCheckValid == false);
                    do {
                        isCheckValid = true;
                        System.out.print("Enter publisher: ");
                        publisher = cin.nextLine().trim();
                        if (publisher.equalsIgnoreCase("")) {
                            System.out.println("Publisher can't be empty");
                            isCheckValid = false;
                        }
                    } while (isCheckValid == false);
                    do {
                        isCheckValid = true;
                        try {
                            System.out.print("Enter number of copies: ");
                            numOfCopies = Integer.parseInt(cin.nextLine());
                            if (numOfCopies < 1) {
                                isCheckValid = false;
                            }
                        } catch (NumberFormatException exception) {
                            isCheckValid = false;
                        }
                        if (isCheckValid == false) {
                            System.out.println("Number of copies is not valid");
                        }
                    } while (isCheckValid == false);
                    switch (func) {
                        case 1:
                            do {
                                isCheckValid = true;
                                System.out.print("Enter author name: ");
                                author = cin.nextLine().trim();
                                if (author.equalsIgnoreCase("")) {
                                    System.out.println("Author name can't be empty");
                                    isCheckValid = false;
                                }
                            } while (isCheckValid == false);
                            do {
                                isCheckValid = true;
                                try {
                                    System.out.print("Enter number of pages: ");
                                    numOfCopies = Integer.parseInt(cin.nextLine());
                                    if (numOfCopies < 1) {
                                        isCheckValid = false;
                                    }
                                } catch (NumberFormatException exception) {
                                    isCheckValid = false;
                                }
                                if (isCheckValid == false) {
                                    System.out.println("Number of pages is not valid");
                                }
                            } while (isCheckValid == false);
                            bm.addBook(new Book(ID, publisher, numOfCopies, author, page));
                            break;

                        case 2:
                            do {
                                isCheckValid = true;
                                System.out.print("Enter public date [dd-mm-yyyy]: ");
                                try {
                                    datePublic = sm.parse(cin.nextLine().trim());
                                } catch (Exception e) {
                                    System.out.println("Date is not valid");
                                    isCheckValid = false;
                                }
                            } while (isCheckValid == false);
                            do {
                                isCheckValid = true;
                                try {
                                    System.out.print("Enter number of the public: ");
                                    numPublic = Integer.parseInt(cin.nextLine());
                                    if (numPublic < 1) {
                                        isCheckValid = false;
                                    }
                                } catch (NumberFormatException exception) {
                                    isCheckValid = false;
                                }
                                if (isCheckValid == false) {
                                    System.out.println("Number of the public is not valid");
                                }
                            } while (isCheckValid == false);
                            bm.addBook(new Magazine(ID, publisher, numOfCopies, datePublic, numPublic));
                            break;

                        case 3:
                            do {
                                isCheckValid = true;
                                System.out.print("Enter public date [dd-mm-yyyy]: ");
                                try {
                                    datePublic = sm.parse(cin.nextLine().trim());
                                } catch (Exception e) {
                                    System.out.println("Date is not valid");
                                    isCheckValid = false;
                                }
                            } while (isCheckValid == false);
                            bm.addBook(new Newspaper(ID, publisher, numOfCopies, datePublic));
                            break;

                    }
                    cin.nextLine();
                    break;
                case 2:
                    ID = 0;
                    System.out.println("--------------- Delete book ---------------");
                    do {
                        isCheckValid = true;
                        try {
                            System.out.print("Enter ID: ");
                            ID = Integer.parseInt(cin.nextLine());
                            if (ID < 1) {
                                isCheckValid = false;
                            }
                        } catch (NumberFormatException exception) {
                            isCheckValid = false;
                        }
                        if (isCheckValid == false) {
                            System.out.println("ID is not valid");
                        }
                        if (! bm.isIDExits(ID)) {
                            System.out.print("ID is not existed,");
                            isCheckValid = false;
                        }
                    } while (isCheckValid == false);
                    bm.deleteBook(ID);
                    cin.nextLine();
                    break;
                case 3:
                    bm.showBook();
                    cin.nextLine();
                    break;
                case 4:
                    System.out.println("--------------- Find by type ---------------");
                    System.out.println("1. Book.");
                    System.out.println("2. Magazine.");
                    System.out.println("3. Newspaper.");
                    do {
                        isCheckValid = true;
                        try {
                            System.out.print("Choose an option: ");
                            func = Integer.parseInt(cin.nextLine());
                            if (func < 1 || func > 3) {
                                isCheckValid = false;
                            }
                        } catch (NumberFormatException exception) {
                            isCheckValid = false;
                        }
                        if (isCheckValid == false) {
                            System.out.println("Option is not valid");
                        }
                    } while (isCheckValid == false);
                    
                    for (Document arg : bm.findBook(func)) {
                        System.out.println(arg);
                    }
                    cin.nextLine();
                    break;

            }
        } while (func != 5);
    }

}
