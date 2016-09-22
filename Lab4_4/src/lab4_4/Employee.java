/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_4;

public class Employee {
    protected double basic_pay;
    protected int Emp_code;
    protected String Emp_name;
    protected String Address;
    protected int Ph_no;
    protected static double DA = 10;
    protected static double HRA = 20;

    public double salary()
    {
        return (basic_pay +(basic_pay * DA/100)+ (basic_pay * HRA/100));
    }
}
