/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5_2b;

public class Square extends Shape 
{
    double s;
    
    public Square(double t_s) 
    {
        s = t_s;
    }
    
    @Override
    public void area() 
    {
        System.out.println("Area of rectangle: " + (s * s));
    }
}
