/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericclassex;

/**
 *
 * @author lenovo
 */
public class GenericClassEx
{
    public static void main(String[] args)//this is where the execution will start from
    {
       dictionary<String,String> data = new dictionary<>("Apple","It is a type of fruit");
       data.printmeaning();
    }
    


static class dictionary<W,M>
{
    //this has been created by user but not user defined so it can work with system generated data types
private W word;//w and m here are both data types
private M meaning;//we can use anything else also

public dictionary(W word, M meaning)
 
{
this.word = word;
this.meaning = meaning;
}

private void printmeaning()
{
    System.out.println(word);
    System.out.println(meaning);
}
}

}


