/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack1;

import java.io.*;

public class StdDataInOut
{
    public static void main(String[] args)  throws FileNotFoundException
    {
       String StdNames[] = {"Rahul","Ramesh"};
       int StdAges[] = {12,14};
       float StdFees[]={12000.00f,15000.00f};
       char StdGens[] = {'M','M'};
       
       try{
           
       DataOutputStream dobj = new DataOutputStream(new FileOutputStream("C:\\Users\\lenovo\\Desktop\\NB_Notepad\\StudentData.txt"));
       
       for (int i = 0; i < StdNames.length; i++) 
       {
       dobj.writeUTF(StdNames[i]);
       dobj.writeChar('\t');
       
       dobj.write(StdAges[i]);
       dobj.writeChar('\t');
       
       dobj.writeFloat(StdFees[i]);
       dobj.writeChar('\t');
       
       dobj.writeChar(StdGens[i]);
       dobj.writeChar('\t');
       
       }
       
       DataInputStream d =new DataInputStream(new FileInputStream("C:\\Users\\lenovo\\Desktop\\NB_Notepad\\StudentData.txt"));
       
        while(true)
        {
          
            String StdName = d.readUTF();
            d.readChar();
            System.out.println(StdName);
          
            int StdAge = d.readInt();
            d.readChar();
            System.out.println(StdAge);
            
            float StdFee = d.readFloat();
            d.readChar();
            System.out.println(StdFee);
            
            char StdGen = d.readChar();
            d.readChar();
            System.out.println(StdGen);
            
            System.out.println("Name : "+StdName+" Age: "+StdAge+" Fees: "+StdFee+" Gender: "+StdGen);
          
        }
       
       }
       
       catch(IOException e)
       {
           System.out.println(e.getMessage());
       }
       
    }
}
