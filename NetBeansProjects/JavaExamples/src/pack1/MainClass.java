/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack1;

/**
 *
 * @author lenovo
 */
public class MainClass {
    
    public static void main(String[] args) {
        
        PTEmployee p = new PTEmployee();//part time employees have wages
        FTEmployee f = new FTEmployee();//full time employee has salary
        
        p.accept();
        f.accept();
    }
}
