/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacollectionex;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author lenovo
 */
public class ArrayListEx 
{
    public static void main(String[] args) 
    {
        ArrayList<Book> bookDetails = new ArrayList<Book>();
        Book b1 = new Book(1, "Core Java", "ABC", "McGrawHill", 7);
        Book b2 = new Book(2, "Adavance Java", "Jony", "Beta", 6);
        Book b3 = new Book(3, "Spring", "Tim", "Cookbook", 10);
        Book b4 = new Book(4, "HTML5", "abc", "qwerty", 11);
        
        
        bookDetails.add(b1);
        bookDetails.add(b2);
        bookDetails.add(b3);
        bookDetails.add(b4);
        
        
        
        
        for(Book b: bookDetails)
        {
            System.out.println("-------------------------------");
            System.out.println("Id is : " + b.id);
            System.out.println("Bookname is : " + b.BookName);
            System.out.println("Author is : " + b.BookAuthor);
            System.out.println("Publisher is : " + b.BookPublisher);
            System.out.println("Qty is : " + b.qty);
            System.out.println("-------------------------------");
        }
        
        bookDetails.remove(b4);
        
                
        
               
        
        for(Book b: bookDetails)
        {
            System.out.println("-------------------------------");
            System.out.println("Id is : " + b.id);
            System.out.println("Bookname is : " + b.BookName);
            System.out.println("Author is : " + b.BookAuthor);
            System.out.println("Publisher is : " + b.BookPublisher);
            System.out.println("Qty is : " + b.qty);
            System.out.println("-------------------------------");
        }
        
       bookDetails.add(b4);
       
               
        
        for(Book b: bookDetails)
        {
            System.out.println("-------------------------------");
            System.out.println("Id is : " + b.id);
            System.out.println("Bookname is : " + b.BookName);
            System.out.println("Author is : " + b.BookAuthor);
            System.out.println("Publisher is : " + b.BookPublisher);
            System.out.println("Qty is : " + b.qty);
            System.out.println("-------------------------------");
        }
        
        
        //Iterator itr = bookDetails.iterator();
       // while(itr.hasNext())
        //{
       //     System.out.println("Book details are : " + itr.next());
       // }
    }
}

class Book
{
int id,qty;
String BookName,BookAuthor,BookPublisher;

public Book(int id, String Name, String Author, String Publisher, int qty)
{
this.id = id;
this.BookName = Name;
this.BookAuthor = Author;
this.BookPublisher = Publisher;
this.qty=qty;
}
}