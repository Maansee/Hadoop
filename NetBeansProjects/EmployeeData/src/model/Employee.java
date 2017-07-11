/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author lenovo
 */
public class Employee 
{
    private String empNum;
    private String empName;
    private int empAge;
    private String empPhone;
    private double empSal;
    private String empCity;
    private String empCount;

    @Override
    public String toString() 
    {
        return "Employee{" + "empNum=" + empNum + ", empName=" + empName + ", empAge=" + empAge + ", empPhone=" + empPhone + ", empSal=" + empSal + ", empCity=" + empCity + ", empCount=" + empCount + '}';
    }

    public String getEmpNum() {
        return empNum;
    }

    public void setEmpNum(String empNum) {
        this.empNum = empNum;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpAge() {
        return empAge;
    }

    public void setEmpAge(int empAge) {
        this.empAge = empAge;
    }

    public String getEmpPhone() {
        return empPhone;
    }

    public void setEmpPhone(String empPhone) {
        this.empPhone = empPhone;
    }

    public double getEmpSal() {
        return empSal;
    }

    public void setEmpSal(double empSal) {
        this.empSal = empSal;
    }

    public String getEmpCity() {
        return empCity;
    }

    public void setEmpCity(String empCity) {
        this.empCity = empCity;
    }

    public String getEmpCount() {
        return empCount;
    }

    public void setEmpCount(String empCount) {
        this.empCount = empCount;
    }
    
   



    public Employee(String empNum, String empName, int empAge, String empPhone, double empSal, String empCity, String empCount, String empCount1)
    {
        super();
        this.empNum=empNum;
        this.empName = empName;
        this.empAge = empAge;
        this.empPhone = empPhone;
        this.empSal = empSal;
        this.empCity = empCity;
        this.empCount = empCount;
    }

}
