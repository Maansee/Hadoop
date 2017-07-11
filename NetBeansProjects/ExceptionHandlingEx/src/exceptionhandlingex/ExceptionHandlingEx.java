/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionhandlingex;

/**
 *
 * @author lenovo
 */
import java.io.*;
import java.util.Scanner;

public class ExceptionHandlingEx {

    String name;
    int age;
    
    public void accept()
    {
       try{
        
        Scanner s =new Scanner(System.in);
        System.out.println("Enter Name: ");
        name = s.next();
        
        System.out.println("Enter Age: ");
        age = s.nextInt();
    }
       catch(Exception xe)
       {
       System.out.println(xe.getMessage());
       }
    }
    
    public void display()
    {
        try{
            System.out.println("Name is " +name);
        
             System.out.println("Age is " +age);
        }
        catch(Exception ee){
        System.out.println(ee.getMessage());
        }
        
    }
    
    public void checkmarks()
    {
    try{
        
    int m1,m2,m3;
    m1=m2=m3=0;
    m3=m1/m2;
    }
    catch(Exception me){
    System.out.println(me.getMessage());
    }
    }
    
    public static void main(String[] args) {
        
       
        ExceptionHandlingEx e = new ExceptionHandlingEx();
        
        try {
            e.checkmarks();
        }
        catch(ArithmeticException ae)
        {
            System.out.println("Caught exception" + ae.getMessage());
        }
   
        e.accept();
          e.display();
    }  
}
