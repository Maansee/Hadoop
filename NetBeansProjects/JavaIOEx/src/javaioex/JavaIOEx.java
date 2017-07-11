/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaioex;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author lenovo
 */
public class JavaIOEx {

    
    public static void main(String[] args) throws FileNotFoundException
    {
       int i;
       char c;
       
       try
       {
        FileInputStream f = new FileInputStream("C:\\Users\\lenovo\\Desktop\\test.txt");
        
        while((i=f.read())!=-1)
        {
        c=(char) i;
        }
       }
       
       catch(IOException e)
       {
           System.out.println(e.getMessage());
       }
    }
    
}
