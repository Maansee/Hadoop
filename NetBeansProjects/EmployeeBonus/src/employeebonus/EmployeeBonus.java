/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeebonus;
import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class EmployeeBonus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        float empSal; 
        double salaryTotal = 0; 
        double bonus = 0; 
        double sumSalary=0;
        double sumBonus=0;
        int i=0;
        String empName;
        double b1=0.0,b2=0.0,b3=0.0;
        
 
       Scanner s= new Scanner(System.in);
    
        
    while(i<3)
    {
        System.out.println("Enter Employee Name: ");
        empName = s.next();
        
        System.out.println("Enter Employee salary: ");
        empSal = s.nextInt();
        {
        
        if  (empSal<=10000)
            {
            bonus = empSal*0.3; //calculate bonus.
            salaryTotal = empSal + bonus;
            System.out.println("The bonus is " + bonus);
            System.out.println("The total salary + bonus is " + salaryTotal);
            b1=bonus;
            
            
            }
        
        else if (empSal >10000 && empSal <=50000)
            {
            bonus = empSal*0.2; // This takes the entered salary and calculates the bonus.
            salaryTotal = empSal + bonus;
            System.out.println("The bonus is " + bonus);
            System.out.println("The total salary + bonus is " + salaryTotal);
            b2=bonus;
            
            
            }
        else if (empSal >50000 && empSal <=100000)
            {

            bonus = empSal*0.1;
            salaryTotal = empSal + bonus; // This takes the entered salary and calculates the bonus.
            System.out.println("The bonus is " + bonus);
            System.out.println("The total salary + bonus is " + salaryTotal);
            b3=bonus;
           
            
            }
        
    
        }

   i++;  
   //sumBonus=b1+b2+b3;
   
}
    
  //System.out.println("The total amout of bonus is " + sumBonus );
 
    
}
}
