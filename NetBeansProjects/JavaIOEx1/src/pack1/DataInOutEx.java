/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack1;

import java.io.*;
public class DataInOutEx 
{
    public static void main(String[] args) throws FileNotFoundException
    {
        float prices[] = {19.99f,9.99f};
        int units[] = {12,8};
        String description[] ={"Test 1","test 2"};
        
        try{
            
       
        DataOutputStream doobj = new DataOutputStream(new FileOutputStream("C:\\Users\\lenovo\\Desktop\\Testdata.txt"));
        
        for (int i = 0; i < prices.length; i++) 
        {
            doobj.writeFloat(prices[i]);
            doobj.writeChar('\t');
            
            doobj.writeInt(units[i]);
            doobj.writeChar('\t');
            
            doobj.writeUTF(description[i]);
            doobj.writeChar('\t');
        }
        
        DataInputStream di = new DataInputStream(new FileInputStream("C:\\Users\\lenovo\\Desktop\\Testdata.txt"));
        
        
        float total =0;
        while(true)
        {
        float price = di.readFloat();
        di.readChar();
        System.out.println(price);
        
        int unit = di.readInt();
        di.readChar();
        System.out.println(unit);
        
        String desc = di.readUTF();
        di.readChar();
        System.out.println(desc);
         
        System.out.println("Order is made up of "+unit+" units of "+desc+" at $"+price);
        
        total = total + (unit*price);
        System.out.println("total price:  " + total);
        
        }
   
    }
        catch(Exception ee)
        {
           System.out.println("Exception: "+ee.getMessage()); 
        }
    }
    
}
