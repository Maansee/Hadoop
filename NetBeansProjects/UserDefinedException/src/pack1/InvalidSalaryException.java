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
public class InvalidSalaryException extends Exception{
    
    public InvalidSalaryException(String s) // constructor - it is used to always initialize an object
    {
    
    super(s);
    }
    
    public String toString()
    {
        return "Salary should not be 0 else ineligible for loan";
    }
}
