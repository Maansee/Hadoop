/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaarrayex;

/**
 *
 * @author lenovo
 */
public class JavaArrayEx {

static String[] name;

public static void accept()
{
name= new String[10];

name[0]="Tom";
name[1]="Tim";
name[2]="Kom";
name[3]="Kim";
name[4]="Jia";
name[5]="Tay";
name[6]="Peter";
name[7]="Sam";
name[8]="John";
name[9]="Jake";
}

public static void display()
{

    System.out.println("Name is : "+name[0]);
    System.out.println("Name is : "+name[1]);
    System.out.println("Name is : "+name[2]);
    System.out.println("Name is : "+name[3]);
    System.out.println("Name is : "+name[4]);
    System.out.println("Name is : "+name[5]);
    System.out.println("Name is : "+name[6]);
    System.out.println("Name is : "+name[7]);
    System.out.println("Name is : "+name[8]);
    System.out.println("Name is : "+name[9]);
}
    public static void main(String[] args) {
        //JavaArrayEx a = new JavaArrayEx();
        accept();
        display();
    }
    
}
