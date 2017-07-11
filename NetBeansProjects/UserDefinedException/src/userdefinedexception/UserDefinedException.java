/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userdefinedexception;
import java.util.logging.Level;
import java.util.logging.Logger;
import pack1.InvalidAgeException;
/**
 *
 * @author lenovo
 */
public class UserDefinedException {

    public static void validateAge(int age) throws InvalidAgeException
    {
    if(age<18)
    {
    throw new InvalidAgeException("Invalid Age : : should not be less than 18") ;
    }
    }
    
    public static void main(String[] args) {
        
        try
        {
         validateAge(13);
        } 
        
        catch (InvalidAgeException ex) 
        {
           // Logger.getLogger(UserDefinedException.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Exception Occurred : :"+ex.getMessage());
        }
        
    }
    
}
