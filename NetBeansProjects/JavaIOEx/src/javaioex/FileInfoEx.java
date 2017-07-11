/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaioex;

import java.io.File;

/**
 *
 * @author lenovo
 */
public class FileInfoEx 
{
    public static void main(String[] args) 
    {
        try
        {
            File fobj = new File("C:\\Users\\lenovo\\Desktop\\FileInfo.txt");
            
            System.out.println("File read by application?");
            System.out.println(fobj.canRead());
            
            System.out.println("File modified by application?");
            System.out.println(fobj.canWrite());
            
            System.out.println("File deleted by application?");
            System.out.println(fobj.exists());
            
            System.out.println("Actual Path of file:");
            System.out.println(fobj.getAbsolutePath());
            
            System.out.println("File hidden or not");
            System.out.println(fobj.isHidden());
        }
        catch(Exception e)
        {
        
        }
    }
}
