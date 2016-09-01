/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author iiita
 */
public class Employee {
    long employeeId;
    int years;
    double salary;
    double bonus;
    
    Employee (int eYears, long eId, double eSalary) {
        employeeId = eId;
        years = eYears;
        salary = eSalary;
        
        if (eYears < 5) {
            bonus = 0.1 * salary;
        } else {
            bonus = 0.2 * salary;
        }
    }
    
    public double getBonus () {
        return bonus;
    }
}
