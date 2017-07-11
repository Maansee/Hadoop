/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionhandlingex;

/**
 *
 * @author lenovo
 */

import java.io.*;

public class ExceptionEx {
    
    public void accept() throws IOException
    {
     System.out.println("Hello");
    }
    
    public static void main(String[] args) throws IOException
    
    {
       ExceptionEx eobj = new ExceptionEx();
       eobj.accept();
        
    }
    
}
