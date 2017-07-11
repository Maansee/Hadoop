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
public class Calculator {
    
    public void Calculate()
    
    {

         Scanner s = new Scanner(System.in);
        
        int n1,n2,choice;
        double result;
        
        System.out.println("*** Menu Driven Calculator ***");
        System.out.println("1. Addition");
        System.out.println("2. Subtration");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Remainder");
        System.out.println("6. Exit");
        System.out.println("**********************");
        System.out.println("Please enter the operation to be formed:");
        
        choice = s.nextInt();
        
        
switch(choice)
{
case 1://addition
System.out.println("Addition");
System.out.println("Please enter two values to be added");
n1 = s.nextInt();
n2 = s.nextInt();
result=n1+n2;
System.out.println(n1 + " + " + n2 + " = " + result);
break;

case 2://subtraction
System.out.println("subraction");
System.out.println("Please enter two values to be subtrated");
n1 = s.nextInt();
n2 = s.nextInt();
result=n1-n2;
System.out.println(n1 + " - " + n2 + " = " + result);
break;

case 3://multiplication
System.out.println("multiplication");
System.out.println("Please enter two values to be multiplicated");
n1 = s.nextInt();
n2 = s.nextInt();
result=n1*n2;
System.out.println(n1 + " * " + n2 + " = " + result);
break;

case 4://division
System.out.println("division");
System.out.println("Please enter two values to be divided");
n1 = s.nextInt();
n2 = s.nextInt();
result = (double)n1 / n2; //type cast
System.out.println(n1 + " / " + n2 + " = " + result);
break;

case 5://remainder
System.out.println("Remainder");
System.out.println("Please enter two values to find the remainder");
n1 = s.nextInt();
n2 = s.nextInt();
result=n1%n2;
System.out.println(n1 + " % " + n2 + " = " + result);
break;

case 6://exit
System.out.println("Exit!");
break;

default://default
System.out.println("You entered an invalid choice");
}

   
    }
    
    public static void main(String[] args) 
    {
        Calculator c= new Calculator();
        c.Calculate();
}
    
}
