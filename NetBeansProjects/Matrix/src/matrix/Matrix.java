/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrix;

import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class Matrix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
     int m, n, c, d;
      Scanner in = new Scanner(System.in);
 
      System.out.println("Enter the number of rows and columns of matrix");
      m = in.nextInt();
      n  = in.nextInt();
 
      int first[][] = new int[m][n];
 
       System.out.println("Enter the elements of first matrix");
 
      for (  c = 0 ; c < m ; c++ )
         for ( d = 0 ; d < n ; d++ )
            first[c][d] = in.nextInt();
      
      System.out.println("Sum of entered matrices:-");
 
      for ( c = 0 ; c < m ; c++ )
      {
         for ( d = 0 ; d < n ; d++ )
            System.out.print(first[c][d]+"\t");
 
         System.out.println();
      }
     
      
          
        
    }
    
}
