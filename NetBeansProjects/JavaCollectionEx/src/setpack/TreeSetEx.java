/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package setpack;

import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author lenovo
 */
public class TreeSetEx {
    public static void main(String[] args) {
        
   
    
    Set<Book> bookDetails = new TreeSet<Book>();
    
    Book b1 = new Book(1,"Core Java","Tony","Tata", 8);
    Book b2 = new Book(2,"Java","Tons","Pearson", 18);
    Book b3 = new Book(3,"HTML","Thomas","Hill", 13);
    Book b4 = new Book(4,"CSS","Jones","Oxford", 16);
    Book b5 = new Book(5,"DevOps","Bond","CUP", 8);
    Book b6 = new Book(6,"Oracle","Andrew","OUP", 8);
    
    bookDetails.add(b1);
    bookDetails.add(b2);
    bookDetails.add(b3);
    bookDetails.add(b4);
    bookDetails.add(b5);
    bookDetails.add(b6);
    
    for(Book b: bookDetails)
    {
        System.out.println("ID is " +b.id);
        System.out.println("Book Name is " + b.BookName);
        System.out.println("Book Author is " + b.BookAuthor);
        System.out.println("Book Publisher is " + b.BookPublisher);
        System.out.println("Quantity required is " + b.qty);
        System.out.println("---------------------------------------------");
        
    }
  
     }
}

class Book implements Comparable<Book>

{
int id,qty;
String BookName,BookAuthor,BookPublisher;

public Book(int id,String Name, String Author, String Publisher, int qty)
{
this.id = id;
this.BookName = Name;
this.BookAuthor = Author;
this.BookPublisher = Publisher;
this.qty = qty;
}

    @Override
    public int compareTo(Book b) {
        
        if(id>b.id)
        {
        return 1;
        }
        
        else if(id<b.id)
        {
        
        }
    return 0;
       
    }

        
}
