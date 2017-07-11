/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packmap;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author lenovo
 */
public class EmpHashMapEx 
{
    
    public static void main(String[] args) 
    {
      HashMap<Integer , EmployeeInfo> empdata = new HashMap<Integer ,EmployeeInfo>();  
      
      empdata.put(1,new EmployeeInfo("Ram", 23, 50000));
      empdata.put(2,new EmployeeInfo("Sham", 27, 150000));
      empdata.put(3,new EmployeeInfo("Tina", 29, 60000));
      
       for(Map.Entry id: empdata.entrySet())
        {
            System.out.println(id.getKey() + "-->" + id.getValue());
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
