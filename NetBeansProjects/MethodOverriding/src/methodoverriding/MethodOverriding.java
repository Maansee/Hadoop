/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodoverriding;

/**
 *
 * @author lenovo
 */
public class MethodOverriding {

     public static void main(String args[]) {
      Ani a = new Ani();   // Animal reference and object
      Ani b = new Do();   // Animal reference but Dog object

      a.move();   // runs the method in Animal class
      b.move();   // runs the method in Dog class
   }
    
}

class Ani
{
   public void move() {
      System.out.println("Animals can move");
   }
}

class Do extends Ani {
   public void move() {
      System.out.println("Dogs can walk and run");
   }
}