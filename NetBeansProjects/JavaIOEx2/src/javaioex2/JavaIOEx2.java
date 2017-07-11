/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaioex2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author lenovo
 */
public class JavaIOEx2 
{

    
    public static void main(String[] args) 
    {
        try{
            
       
        FileOutputStream fobj = new FileOutputStream("C:\\Users\\lenovo\\Desktop\\NB_Notepad\\EmpObject.txt");
        ObjectOutputStream oobj = new ObjectOutputStream(fobj);
        
        EmployeeDetails e = new EmployeeDetails();
        e.setEmpName("Mike");
        e.setEmpAge(25);
        e.setEmpaddr("Bunglow 3A, Cotton Green Road, Thane, MH, India");
        e.setEmpPh("0123456789");
         
        }
        
        catch(IOException ee)
        {
            System.out.println(ee.getMessage());
        }
    }
    
}
