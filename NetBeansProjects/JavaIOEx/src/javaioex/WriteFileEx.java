/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaioex;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class WriteFileEx
{
    public static void main(String[] args)
    {
            String fname = "C:\\Users\\lenovo\\Desktop\\myfile.txt";
            FileWriter fw = null;
            
            BufferedWriter bw = new BufferedWriter(fw);
        
        try {
            fw = new FileWriter(fname);
            
            bw.write("This is my first line using java programming");
            bw.write("This is my second line using java programming");
            bw.write("This is my third line using java programming");
            bw.write("This is my fourth line using java programming");
            bw.write("This is my fifth line using java programming");
            bw.write("This is my sixth line using java programming");
            
            bw.close();
            fw.close();
        } 
        catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
        finally
        {
            
        try
        {    
        if(bw !=null)
        {
        bw.close();
        }
        
        else if(fw !=null)
                {
                fw.close();
                }
        }
        catch(Exception ee)
        {
            System.out.println(ee.getMessage());
        }
        }
        
        }
    }

