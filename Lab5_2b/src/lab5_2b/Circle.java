/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5_2b;
import java.lang.Math;

public class Circle extends Shape 
{
    double r;
    
    public Circle(double t_r) 
    {
        r = t_r;
    }
    
    @Override
    public void area() 
    {
        System.out.println("Area of rectangle: " + (Math.PI * Math.pow(r, 2)));
    }
}
