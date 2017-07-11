/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacollectionex;

import java.util.LinkedList;

/**
 *
 * @author lenovo
 */
public class LinkedStackEx 
{
    public static void main(String[] args) 
    {
        LinkedList<String> mydata = new LinkedList<>();
        mydata.add("First");
        mydata.add("Second");
        mydata.add("Third");
        mydata.add("Fourth");
        mydata.add("Random");
        
        System.out.println("Elements before push: ");
        System.out.println(mydata);
        mydata.push("Push Element");
        
        System.out.println("Elements after push: ");
        System.out.println(mydata);
        
        mydata.pop();
        System.out.println("Elements after pop:" );
        System.out.println(mydata);
    }
    
}
