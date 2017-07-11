/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack2;

/**
 *
 * @author lenovo
 */
interface Calc
{
int add();
int sub();
}

interface Calculate
{
int mul();
int div();
}

public class InterfaceEx implements Calc,Calculate
{
public int add()
{
return 4+3;
}    

public int sub()
{
return 4-3;
}

public int mul()
{
return 4*3;
}
public int div()
{
return 4/3;
}
}
