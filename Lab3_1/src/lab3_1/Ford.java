/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_1;

public class Ford implements Car {
    float avg;
    int maxSpd;
    int rpm;
    
    @Override
    public void average() {
        avg = 5;
    }
    
    @Override
    public void maxSpeed() {
        maxSpd = 352;
    }
    
    @Override
    public void RPM() {
        rpm = 14000;
    }
}
