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
public class Matrix_product {
    
     public static void main(String args[])
   {
   
      int m, n, p, q, sum = 0, c, d, k;
      Scanner s = new Scanner(System.in);
      
      System.out.print("Enter number of Rows and Columns of First Matrix : ");
      m = s.nextInt();
      n = s.nextInt();
      
      int first[][] = new int[m][n];
      
      System.out.print("Enter First Matrix Elements : ");
      
      for(c=0 ; c<m; c++)
      {
         for(d=0; d<n; d++)
         {
            first[c][d] = s.nextInt();
         }
      }
 
      System.out.print("Enter number of Rows and Columns of Second Matrix : ");
      p = s.nextInt();
      q = s.nextInt();
 
      if ( n != p )
      {
         System.out.print("Incompatible order of matrices!!");
      }
      else
      {
         int second[][] = new int[p][q];
         int multiply[][] = new int[m][q];
 
         System.out.print("Enter Second Matrix Elements :\n");
 
         for(c=0; c<p; c++)
         {
            for(d=0; d<q; d++)
            {
               second[c][d] = s.nextInt();
            }
        }
        
        
 
         for(c=0; c<m; c++)
         {
            for(d=0; d<q; d++)
            {   
               for(k=0; k<p; k++)
               {
                  sum = sum + first[c][k]*second[k][d];
               }
 
               multiply[c][d] = sum;
               sum = 0;
            }
         }
 
        
         System.out.print("Matrix Product :\n");
 
         for(c=0; c<m; c++)
         {
            for(d=0; d<q; d++)
            {
               System.out.print(multiply[c][d] + "\t");
            }
            System.out.print("\n");
         }
      }
	  
   }
}
