/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userdefinedexception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import pack1.InvalidSalaryException;



/**
 *
 * @author lenovo
 */
public class LoanEligibleException {
    
    public static void validateSalary(int sal) throws InvalidSalaryException
    {
    if(sal<=0)
    {
    throw new InvalidSalaryException("Invalid Salary : cannot be negative") ;
    }
    
    else if(sal>0 && sal<10000)
    {
    throw new InvalidSalaryException("Ineligible for loan.") ;
    }
    else if(sal>=10000)
    {
    throw new InvalidSalaryException("Eligible for loan amount 100000") ;
    }
    
    else if(sal>=100000)
    {
    throw new InvalidSalaryException("Eligible for loan amount 1000000") ;
    }
    
    
    }
    
     public static void main(String[] args) {
         
         int sal =0;
         
         //Scanner s = new Scanner(System.in);
         //System.out.println("Enter salary: ");
         //sal=s.nextInt();
         
         BufferedReader inp = new BufferedReader (new InputStreamReader(System.in));
        try {
            sal = Integer.parseInt(inp.readLine());
        } catch (IOException ex) {
            Logger.getLogger(LoanEligibleException.class.getName()).log(Level.SEVERE, null, ex);
        }
         
        
        try
        {
         validateSalary(sal);
        } 
        
        catch (InvalidSalaryException ex) 
        {
           // Logger.getLogger(UserDefinedException.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Exception Occurred : :"+ex.getMessage());
        }
        
    }
    
}
