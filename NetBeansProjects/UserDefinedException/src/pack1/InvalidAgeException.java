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
public class InvalidAgeException extends Exception
{
    public InvalidAgeException()//default constructor
            {
            
            }
    

//parameterized constructor
    //overloading
    public InvalidAgeException(String s) // constructor - it is used to always initialize an object
    {
    
    super(s);
    }
    
    public String toString()
    {
        return "Age should not be less than 18 to vote";
    }
    
    
}