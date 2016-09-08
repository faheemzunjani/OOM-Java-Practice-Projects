/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_1;

public class Ferrari implements Car {
    float avg;
    int maxSpd;
    int rpm;
    
    @Override
    public void average() {
        avg = 6;
    }
    
    @Override
    public void maxSpeed() {
        maxSpd = 351;
    }
    
    @Override
    public void RPM() {
        rpm = 16000;
    }
}
