/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionhandlingex;

/**
 *
 * @author lenovo
 */
public class ExceptionExample 
{
    public static void calc()//example of one try and multiple catch
    {
        try
        {
        int[] num = {20, 10};
        int res = num[1] / 0;
        System.out.println(res);
        }
        
        catch(ArithmeticException ae)
        {
        System.out.println(ae.getMessage());
        }
        
         catch(ArrayIndexOutOfBoundsException ai)
        {
        System.out.println(ai.getMessage());
        }
        
         catch(Exception e)
        {
        System.out.println(e.getMessage());
        }
        
        finally
        {
            System.out.println("From finally");
            for(int i=0;i<2;i++)
            {
                System.out.println(i);
            }
        }
        
        
    }
    
    public static void main(String[] args) 
    {
   
    calc();
    }
}