/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaioex2;

import java.io.Serializable;

/**
 *
 * @author lenovo
 */
public class EmployeeDetails implements Serializable
{
    private String EmpName;
    private int EmpAge;
    private String Empaddr;
    private String EmpPh;

    public String getEmpName() {
        return EmpName;
    }

    public void setEmpName(String EmpName) {
        this.EmpName = EmpName;
    }

    public int getEmpAge() {
        return EmpAge;
    }

    public void setEmpAge(int EmpAge) {
        this.EmpAge = EmpAge;
    }

    public String getEmpaddr() {
        return Empaddr;
    }

    public void setEmpaddr(String Empaddr) {
        this.Empaddr = Empaddr;
    }

    public String getEmpPh() {
        return EmpPh;
    }

    public void setEmpPh(String EmpPh) {
        this.EmpPh = EmpPh;
    }

    
}
