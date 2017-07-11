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
public class FTEmployee extends Employee
{
    
    int salary;
    //we cannot override the static method
    @Override
    public void accept()
    {
    super.accept();
    Scanner s = new Scanner(System.in);
        System.out.println("Enter salary");  
        salary = s.nextInt();
    
    }
}
