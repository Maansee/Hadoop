/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacollectionex;

/**
 *
 * @author lenovo
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class JavaCollectionEx 
{


    public static void main(String[] args) 
    {
       ArrayList<String> EmployeeName = new ArrayList<String>();
       
       EmployeeName.add("david");
       EmployeeName.add("dave");
       EmployeeName.add("dravid");
       EmployeeName.add("mike"); 
       EmployeeName.add("tim");
       EmployeeName.add("belle");
       EmployeeName.add("manc");
       
        System.out.println(EmployeeName);
        
        Iterator itr = EmployeeName.iterator();
        
        while(itr.hasNext())
        {
            System.out.println("Employee Name is " + itr.next());
        }
        
        for(String o1:EmployeeName)
        {
            System.out.println("Name: " + o1);
        }
    }
    
}
