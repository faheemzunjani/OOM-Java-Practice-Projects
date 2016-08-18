/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;
import java.util.*;

/**
 *
 * @author iiita
 */
public class Lab1_1 extends Employee {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String ans;
        int employeeYears;
        long employeeId;
        double employeeSalary;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Annual Bonus Calculation\n");
        
        do {
            System.out.println("Enter Employee Id: ");
            employeeId = Long.parseLong(sc.nextLine());
            System.out.println("Enter Years Of Service: ");
            employeeYears = Integer.parseInt(sc.nextLine());
            System.out.println("Enter Employee Salary: ");
            employeeSalary = Double.parseDouble(sc.nextLine());
            Employee tempEmployee = new Employee(employeeYears, employeeId, employeeSalary);
            System.out.println("Congratulations! Your bonus is Rs "+tempEmployee.getBonus()+".\n");
            System.out.println("Enter more data?(y/n): ");
            ans = sc.nextLine();
        } while (!ans.equals("n"));
    }

    public Lab1_1(int eYears, long eId, double eSalary) {
        super(eYears, eId, eSalary);
    }
    
}
