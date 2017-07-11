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
public class ArrayHighestValue {
    
               
    public static void main(String[] args) 

    {int n, max;

        Scanner s = new Scanner(System.in);

        System.out.print("Enter number of subjects to be entered in the array:");

        n = s.nextInt();

        int a[] = new int[n];

        System.out.println("Enter number of marks:");

        for(int i = 0; i < n; i++)

        {

            a[i] = s.nextInt();

        }

        max = a[0];

        for(int i = 0; i < n; i++)

        {

            if(max < a[i])

            {

                max = a[i];

            }

        }

        System.out.println("Highest score: " +max);

    }
}
