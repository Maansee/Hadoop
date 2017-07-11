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
public class PTEmployee extends Employee
{
    
    int wages;
    //we cannot override the static method
    @Override
    public void accept()//never use ; after accept like accept(); it gives compilation error of missing body or declare abstract
    {
    super.accept();
    Scanner s = new Scanner(System.in);
        System.out.println("Enter wages");  
        wages = s.nextInt();
    
    }
}
