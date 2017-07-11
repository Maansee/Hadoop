/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaarrayex;

import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class ArrayEx2 {
    
    String[] name;
    
    public void accept()
    {
    name = new String[10];
    Scanner input = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter Name: ");
            name[i] = input.next();
        }
    }
    
    public void display()
    {
    for (int i = 0; i < 10; i++) {
            System.out.println("Name is : " +name[i] );
           // name[i] = input.next();
    }
    }
    
    public static void main(String[] args) 
    {
       ArrayEx2 obj = new ArrayEx2();
       obj.accept();
               
       obj.display();
      
       
    }
    
}

