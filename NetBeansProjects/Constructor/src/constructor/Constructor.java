/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructor;

/**
 *
 * @author lenovo
 */
public class Constructor {

   class Parent {
  Parent() {
    System.out.println("Base Class Constructor Called ");
  }
}
 
static class Child extends Parent {
  Child() {
    System.out.println("Derived Class Constructor Called ");
  }
}
    
    public static void main(String[] args) {
        Child c = new Child();
    }
    
}
