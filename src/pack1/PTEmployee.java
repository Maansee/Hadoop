package pack1;

import java.util.Scanner;

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