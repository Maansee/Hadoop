package pack1;

import java.util.Scanner;

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