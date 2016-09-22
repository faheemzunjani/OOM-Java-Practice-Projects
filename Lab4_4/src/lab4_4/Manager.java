/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_4;

class Manager extends Employee
{
    public Manager(int pay,int code,String name,String add,int phone)
    {
        basic_pay = pay;
        Emp_code = code;
	Emp_name = name;
	Address = add;
	Ph_no = phone;
    }
        
    @Override
    public double salary()
    {
        return ((basic_pay * DA/100)+ (basic_pay * HRA/100));  
    }
}
