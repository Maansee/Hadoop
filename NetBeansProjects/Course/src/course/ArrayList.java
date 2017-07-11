/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package course;

import java.util.List;

/**
 *
 * @author lenovo
 */
class Course {

    int marks;
    String name;
    
    public Course(int marks,String name)
    {
    this.marks=marks;
    this.name=name;
    }
    }

public class ArrayList
{
    
    public static void main(String[] args) {
       
       
        List<Course> list = new ArrayList<Course>();
        Course c1 = new Course(58, "Dave");
        Course c2 = new Course(66, "Tom");
        
        list.add(c1);
        list.add(c2);
        
        for(Course c:list)
        {
            System.out.println(c.marks+ " " +c.name);
        }
    }
    
}
