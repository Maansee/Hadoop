package AgeLogic;

import java.util.Scanner;

public class AgeLogicEx {

    String stdName;
    int StdAge;
    int i=0;
    int total=0;

    public void acceptandcheck()
    {
    Scanner s= new Scanner(System.in);
    
        
    while(i<10)
    {
        System.out.println("Enter Student Name: ");
        stdName = s.next();
        
        System.out.println("Enter Student Age: ");
        StdAge = s.nextInt();
        
        if(StdAge>18)
        {
            total=total+1;
                
        }
    i++;
    }
        
    }
    
    public void display()
    {
     System.out.println("Total students eligible:" + total);
    }   
         
    public static void main(String[] args) 
    {
        AgeLogicEx a = new AgeLogicEx();
        a.acceptandcheck();
        a.display();
        
       
    }
    
}
