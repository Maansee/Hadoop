
package employeedata;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import model.Employee;



public class EmployeeData {

    

    public static void main(String[]args) throws IOException{
        ArrayList<Employee> employeeList= new ArrayList<>();
       

        while (employeeList.size() < 1) 
        {
            Scanner sc = new Scanner(System.in);
            System.out.printf("Please enter your employee number:");
            String empNum = sc.next();
            System.out.println("Enter your name: ");
            String empName = sc.next();
            System.out.println("Enter your age: ");
            int empAge = sc.nextInt();
            System.out.println("Enter phone: ");
            String empPhone = sc.next();
            System.out.println("Enter salary: ");
            double empSal = sc.nextDouble();
            System.out.printf("Enter city:");
            String empCity = sc.next();
            System.out.println("Enter country: ");
            String empCount = sc.next();
            employeeList.add(new Employee(empNum, empName, empAge, empPhone, empSal, empCity, empCount, empCount));
            
            
        }

        String  e = employeeList.toString();
        
                
    try{
        
    File file =  new File("C:\\Users\\lenovo\\Desktop\\Customer.txt");
    PrintWriter writer = new PrintWriter(file);
    
    writer.write(e);
   
   // writer.write("ID : " + CustID + "   \nName : " + CustName + "   \nAge: "+CustAge+"   \nPhone: "+CustPh+"   \nSalary: " +CustSal+"   \nCity: " + CustCity + "   \nCountry: " + CustCoun);
    writer.flush();
    writer.close();
    }
    
    catch(FileNotFoundException ex)
    {
        System.err.println(ex.getMessage());
    }
    }

    private static void writer(String string)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
             
    }
    
 
    

    

