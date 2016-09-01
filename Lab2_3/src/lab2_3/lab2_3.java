/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_3;
import user.own.pack.Distance;
import java.util.*;

public class lab2_3 {

    public static void main(String args[]) {
        int d1Feet;
        int d2Feet;
        int d1Inches;
        int d2Inches;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Distance 1: ");
        System.out.println("Feet: ");
        d1Feet = Integer.parseInt(sc.nextLine());
        System.out.println("Inches: ");
        d1Inches = Integer.parseInt(sc.nextLine());
        System.out.println("Enter Distance 2: ");
        System.out.println("Feet: ");
        d2Feet = Integer.parseInt(sc.nextLine());
        System.out.println("Inches: ");
        d2Inches = Integer.parseInt(sc.nextLine());
        
        Distance d1 = new Distance(d1Feet, d1Inches);
        Distance d2 = new Distance(d2Feet, d2Inches);
        
        Distance d3 = d1.addDistances(d2);
        
        System.out.println("Sum of both distances: " + d3.getFeet() + 
                " feet and " + d3.getInches() + " inches.\n");
    }    
}
