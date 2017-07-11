/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaioex;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


/**
 *
 * @author lenovo
 */
public class WriteBinaryDataEx 
{
    public static void main(String[] args) 
    {
       String datafile = "C:\\Users\\lenovo\\Desktop\\bindata.txt";
       
       String bytedata = "This is example of Byte Data";
       byte[] buffer = bytedata.getBytes();
       
       FileOutputStream fous = null;
        try {
            fous = new FileOutputStream(datafile);
            fous.write(buffer);
            fous.close();
            
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        finally
        {
            System.out.println("Completed writing data to file");
        }
    }
}
