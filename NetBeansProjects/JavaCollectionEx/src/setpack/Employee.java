/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package setpack;
//wajp to create generic class to accept employee age and salary
import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class Employee
{
    public static void main(String[] args) 
    {
    
    double sal;
    int ag;
    Scanner s = new Scanner(System.in);
    System.out.println("Enter age and salary of employee: ");
    ag = s.nextInt();
    sal = s.nextDouble();
    EmployeeDetails<Integer,Double> data = new EmployeeDetails(ag, sal);
    data.show();
       
    }
    
}

class EmployeeDetails<age,salary>
{
int age;
double salary;
String name;

public EmployeeDetails(int age,double salary)
{
this.age = age;
this.salary = salary;
}

void show()
{
System.out.println("Age: " + age);
System.out.println("Salary: " + salary);
}


}