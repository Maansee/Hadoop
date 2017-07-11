/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaioex1;
import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class JavaIOEx1 {

   
    public static void main(String[] args) 
    {
        try
        {
        FileOutputStream fobj = new FileOutputStream("C:\\Users\\lenovo\\Desktop\\JavaObject.txt");
        ObjectOutputStream oobj = new ObjectOutputStream(fobj);
        
        oobj.writeObject(new Date());
        oobj.writeBoolean(true);
        oobj.writeFloat(23.77f);
        
        Student sobj1 = new Student();
        sobj1.setStdName("Tim");
        sobj1.setStdAge(12);
        
        Student sobj2 = new Student();
        sobj2.setStdName("Kim");
        sobj2.setStdAge(14);
        
        Course c1=new Course();
        c1.setCrsName("Java Technology");
        
         Course c2=new Course();
        c2.setCrsName("Web Technology");
        
        List<Student> l1 = new ArrayList<Student>();
        l1.add(sobj1);
        
        List<Student> l2 = new ArrayList<Student>();
         l1.add(sobj2);
        
        c1.setStdDetails(l1);
        
        oobj.writeObject(c1);
         
                
        ObjectInputStream oibj = new ObjectInputStream(new FileInputStream("C:\\Users\\lenovo\\Desktop\\JavaObject.txt"));
        Date dd = (Date) oibj.readObject();
        Boolean bb = oibj.readBoolean();
        Float ff = oibj.readFloat();
        
            System.out.println("Date: " +dd);
            System.out.println("Boolean: " +bb);
            System.out.println("Float: " +ff);
            
            Course cin = new Course();
            cin = (Course) oibj.readObject();
            
            System.out.println(cin.getCrsName());
            System.out.println(cin.getStdDetails());
            
            Student s =cin.getStdDetails().get(0);
            
            System.out.println(s.getStdName());
            System.out.println(s.getStdAge());
             
        }
    
        catch (IOException ee) 
        {
            System.out.println("Exception occurred " +ee.getMessage());
        }
        catch (ClassNotFoundException ce) 
        {
            System.out.println("Exception occurred " +ce.getMessage());
        }
        catch (Exception e) 
        {
            System.out.println("Handle Any missed Exceptions");
        }
    }
    
}
