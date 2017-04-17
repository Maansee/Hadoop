package pack1;

import java.util.Scanner;

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
