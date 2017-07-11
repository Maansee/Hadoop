/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaarrayex;

import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class ArrayCalc {
    
    
       public static void main(String[] args) 

    {

        int n, sum = 0;

        float average;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total numbers to be present in an array:");

        n = sc.nextInt();

        int a[] = new int[n];

        System.out.println("Enter all the elements:");

        for(int i = 0; i < n ; i++)

        {

            a[i] = sc.nextInt();

            sum = sum + a[i];

        }

        System.out.println("Sum:"+sum);

        average = (float)sum / n;

        System.out.println("Average:"+average);

    }
}
