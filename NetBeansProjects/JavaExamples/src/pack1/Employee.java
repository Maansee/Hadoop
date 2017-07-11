/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack1;

import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class Employee {
    
    String name;
    int Empid;
    
    public void accept()
    {
    Scanner s = new Scanner(System.in);
        System.out.println("Enter Name: ");
        name = s.next();
        
        System.out.println("Enter EmpID:");
        Empid = s.nextInt();
        
        
    }
    
}
