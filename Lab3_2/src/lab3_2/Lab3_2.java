/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_2;
import java.util.*;

public class Lab3_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String newName;
        String newLoc;
        McDonalds newMcD;
        
        System.out.println("Enter McDonalds details:");
        System.out.println("Enter restaurant name:");
        newName = sc.nextLine();
        System.out.println("Enter location:");
        newLoc = sc.nextLine();
        
        newMcD = new McDonalds(newName, newLoc);
        
        if (newMcD.hasPlayPlace()) {
            System.out.println("It has playplace!");
        } else {
            System.out.println("It does not have playplace!");
        }
    }   
}
