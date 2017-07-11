/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package setpack;

import java.util.HashSet;

/**
 *
 * @author lenovo
 */
public class EmpHashEx {
    
    public static void main(String[] args) {
        
   
    
    HashSet<EmployeeInfo> empdata = new HashSet<>();
    
    //Scanner s = new Scanner(System.in);
    empdata.add(new EmployeeInfo("Ram",23,50000));
    empdata.add(new EmployeeInfo("Jake", 44, 1000000));
    empdata.add(new EmployeeInfo("Drake", 36, 10000));
    empdata.add(new EmployeeInfo("Duke", 54, 90000));
    empdata.add(new EmployeeInfo("Tina", 24, 60000));
    
    for(EmployeeInfo e: empdata)
        {
            System.out.println(e);
        }
}
     

}

class EmployeeInfo
{
private String name;
private int age; 
private double salary;

public EmployeeInfo(String name,int age, double salary)
{
this.name = name;
this.age = age;
this.salary = salary;
}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    public String toString()
 {
 return "Name: " + name + " , " + "Age : "+ age + " , " + "Salary: " +salary;
 }
    
}
