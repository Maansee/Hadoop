/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customerdetails;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import java.util.Scanner;


public class CustomerDetails
{

       public static void main(String[] args) throws FileNotFoundException 
    {
   
      
        Scanner s = new Scanner(System.in);
        String CustID, CustName,CustPh,CustCity,CustCoun;
        int CustAge;
        String CustSal;
        
        
       
                System.out.println("Please enter the customer ID: ");
                CustID = s.next();
             
                System.out.println("Please enter the customer name: ");
                CustName = s.next();
             
                System.out.println("Please enter the customer age: ");
                CustAge = s.nextInt();
           
                System.out.println("Please enter the customer phone: ");
                CustPh = s.next();
             
                System.out.println("Please enter the customer salary: ");
                CustSal = s.next();
            
                System.out.println("Please enter the customer city: ");
                CustCity = s.next();
            
                System.out.println("Please enter the customer Country: ");
                CustCoun = s.next();
                
           
    try{
        
    File file =  new File("C:\\Users\\lenovo\\Desktop\\Customer.txt");
    PrintWriter writer = new PrintWriter(file);
    
   
    writer.write("ID : " + CustID + "   \nName : " + CustName + "   \nAge: "+CustAge+"   \nPhone: "+CustPh+"   \nSalary: " +CustSal+"   \nCity: " + CustCity + "   \nCountry: " + CustCoun);
    writer.flush();
    writer.close();
    }
    
    catch(Exception e)
    {
        System.err.println(e.getMessage());
    }
    }

    private static void writer(String string)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
