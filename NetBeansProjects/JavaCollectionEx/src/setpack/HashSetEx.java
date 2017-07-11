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
public class HashSetEx 
{
    public static void main(String[] args)
    {
        HashSet hobj = new HashSet();
        hobj.add("sunday");
        hobj.add("monday");
        hobj.add("tuesday");
        hobj.add("wednesday");
        hobj.add("thursday");
        hobj.add("friday");
        hobj.add("saturday");
        
        System.out.println("Data display: " + hobj);
        System.out.println("Size before removing sunday: " + hobj.size());
        
        hobj.remove("sunday");
        
        System.out.println("Data display after removing sunday: " + hobj);
        
        System.out.println("Size after removing sunday: " + hobj.size());
    }
    
}
