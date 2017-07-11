/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packmap;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author lenovo
 */
public class HashMapEx 
{
    public static void main(String[] args) 
    {
        HashMap<Integer , String> employeedata = new HashMap<Integer , String>();
        
        employeedata.put(101,"Tim");
        employeedata.put(102,"Kim");
        employeedata.put(103,"Tom");
        employeedata.put(104,"Jim");
        employeedata.put(105,"June");
        employeedata.put(106,"Kelly");
        employeedata.put(107,"Fin");
       
        for(Map.Entry id: employeedata.entrySet())
        {
            System.out.println(id.getKey() + "------------------" + id.getValue());
        }
        
    }
}
