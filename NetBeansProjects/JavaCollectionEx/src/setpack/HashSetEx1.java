/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package setpack;

import java.util.HashSet;

/**
 *
 * @author lenovo
 */
public class HashSetEx1 
{
    public static void main(String[] args) {
        
        HashSet<Price> mydata = new HashSet<>();
        
        mydata.add(new Price("Box",23));
        mydata.add(new Price("102",68));
        mydata.add(new Price("Comb",15));
        mydata.add(new Price("108",33));
        mydata.add(new Price("Laptop",45000));
        
        for(Price pobj: mydata)//pobj is the object of price
        {
            System.out.println(pobj);
        }
    }
}

class Price
{
private String item;
private int price; 

//creating a constructor here
public Price(String item, int price)
{
this.item = item;
this.price = price;
}

public void setItem(String item)
{
this.item = item;
}

public void setPrice(int price)
{
this.price = price;
}

 public String getItem() {
        return item;
    }

 public int getPrice() {
        return price;
    }
 
 public String toString()
 {
 return "item: " + item + " " + "price: "+ price;
 }
}
