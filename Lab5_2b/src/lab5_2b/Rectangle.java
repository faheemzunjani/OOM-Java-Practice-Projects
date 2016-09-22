/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5_2b;

public class Rectangle extends Shape 
{
    double l;
    double b;
    
    public Rectangle(double t_l, double t_b) 
    {
        l = t_l;
        b = t_b;
    }
    
    @Override
    public void area() 
    {
        System.out.println("Area of rectangle: " + (l * b));
    }
}
