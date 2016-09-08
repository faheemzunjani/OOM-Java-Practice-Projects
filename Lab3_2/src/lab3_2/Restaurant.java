/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_2;

/**
 *
 * @author iiita
 */
abstract class Restaurant {
    String name;
    String locat;
    String menuIt;
    
    public void printName() {
        System.out.println("Name of restaurant: " + name);
    }
    abstract float totalPrice();
    abstract void menuItems();
    abstract String location();
    
    
}
