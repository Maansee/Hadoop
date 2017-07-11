/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacollectionex;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author lenovo
 */
public class CheckedListEx 
{
    public static void main(String[] args) 
    {
        LinkedList<String> mydata = new LinkedList<>();
        
        mydata.add("First");
        mydata.add("Second");
        mydata.add("Third");
       // mydata.add("Fourth");
        mydata.add("Random");
        
        
        List<String> listdata = new LinkedList<String>();
        System.out.println("Does LinkedList contain all elements? : " +mydata.containsAll(listdata));
        listdata.add("one");
        System.out.println("Does LinkedList contain all elements? : " +mydata.containsAll(listdata));
        
                
    }
    
}
