/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user.own.pack;

public class Distance {
    private int Feet;
    private int Inches;
    
    public Distance(int DFeet, int DInches) {
        Feet = DFeet;
        Inches = DInches;
    }
    
    public Distance addDistances(Distance d2) {
        Distance d3 = new Distance(0, 0);
        
        d3.Feet = this.Feet + d2.Feet;
        d3.Inches = this.Inches + d2.Inches;
        
        if (d3.Inches == 12) {
            d3.Feet++;
            d3.Inches = 0;
        } else if (d3.Inches > 12) {
            d3.Feet++;
            d3.Inches-= 12;
        }
        
        return d3;
    }
    
    public int getFeet() {
        return Feet;
    }
    
    public int getInches() {
        return Inches;
    }
}
