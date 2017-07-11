/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexamples;

/**
 *
 * @author lenovo
 */
public class JavaExamples {

        //default constructor
    public JavaExamples()
    {
        System.out.println("Default Constructor");
    }
    
    public JavaExamples(int a)
    {
        System.out.println("Parameterized constructor with one integer");
    }
    
    public JavaExamples(int a,int b)
    {
        System.out.println("Parameterized constructor with two integer");
    }
    
    public JavaExamples(float a)
    {
        System.out.println("Parameterized constructor with one float");
    }
    public static void main(String[] args) {
       //JavaExamples j = new JavaExamples(12.23f);
       //JavaExamples j = new JavaExamples();
       MyClass m = new MyClass();
       
    }
}
    class MyClass extends JavaExamples
    {
    public MyClass()
    {
        System.out.println("Hello from child class");
    }
    }


