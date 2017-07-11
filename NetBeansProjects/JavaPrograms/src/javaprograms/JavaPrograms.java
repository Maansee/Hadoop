/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprograms;

import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class JavaPrograms {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int rev=0, num, n;
        
      System.out.println("Enter the number to be reversed: ");
      Scanner sc = new Scanner(System.in);
      n = sc.nextInt();
      num=n;
      
      while( n != 0 )
      {
          rev = rev * 10;
          rev = rev + n%10;
          n = n/10;
      }
 
      System.out.println("Reverse of" + num + " is "+rev);
   }
      
        
    }
    

