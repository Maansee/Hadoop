/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkginterface;

/**
 *
 * @author lenovo
 */
public class Interface implements MyInterface{

    
    public static void main(String[] args) 
    {
    MyInterface obj = new Interface();
      obj. method1();
    }

    @Override
    public void method1() {
        System.out.println("implementation of method1");
    }

    @Override
    public void method2() {
        System.out.println("implementation of method2");
    }
    
}

interface MyInterface
{
   public void method1();
   public void method2();
}
