/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_3;
import java.util.*;

public class Lab3_3 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Employee emp1 = new Employee();
        Employee emp2 = new Employee();
        Organization org1 = new Organization();
        Organization org2 = new Organization();
        String ch;
        String tempName;
        long tempNoEmp;
        String tempSex;
        String tempJT;
        String tempOrgName;
        String tempBDate;
        int flag;
        
        do {
            System.out.println("Enter 'e' to enter Employee data");
            System.out.println("Enter 'o' to enter Organization data");
            System.out.println("Enter 'ce' to compare 2 Employees");
            System.out.println("Enter 'co' to compare 2 Employees");
            System.out.println("Enter 'exit' to exit");
            System.out.println("Enter choice:");
            ch = sc.nextLine();
            
            if (ch.equals("e")) {
                System.out.println("Enter details for Employee 1:");
                System.out.println("Enter Name:");
                tempName = sc.nextLine();
                System.out.println("Enter Sex:");
                tempSex = sc.nextLine();
                System.out.println("Enter Job Title:");
                tempJT = sc.nextLine();
                System.out.println("Enter Organization Name:");
                tempOrgName = sc.nextLine();
                System.out.println("Enter Birth Date:");
                tempBDate = sc.nextLine();
                emp1.setEmpData(tempName, tempSex, tempJT, tempBDate, tempOrgName);
                
                System.out.println("Enter details for Employee 1:");
                System.out.println("Enter Name:");
                tempName = sc.nextLine();
                System.out.println("Enter Sex:");
                tempSex = sc.nextLine();
                System.out.println("Enter Job Title:");
                tempJT = sc.nextLine();
                System.out.println("Enter Organization Name:");
                tempOrgName = sc.nextLine();
                System.out.println("Enter Birth Date:");
                tempBDate = sc.nextLine();
                emp2.setEmpData(tempName, tempSex, tempJT, tempBDate, tempOrgName);            
            } else if (ch.equals("o")) {
                System.out.println("Enter details for Organization 1:");
                System.out.println("Enter Organization Name:");
                tempOrgName = sc.nextLine();
                System.out.println("Enter Number of employees:");
                tempNoEmp = Long.parseLong(sc.nextLine());
                org1.setOrgData(tempOrgName, tempNoEmp);
                
                System.out.println("Enter details for Organization 2:");
                System.out.println("Enter Organization Name:");
                tempOrgName = sc.nextLine();
                System.out.println("Enter Number of employees:");
                tempNoEmp = Long.parseLong(sc.nextLine());
                org2.setOrgData(tempOrgName, tempNoEmp);
            } else if (ch.equals("ce")) {
                flag = emp1.compareEmp(emp2);
                
                if (flag == 1) {
                    System.out.println("Both employees are same!\n");
                } else {
                    System.out.println("Both employees are different!\n");
                }
            } else if (ch.equals("co")) {
                flag = org1.compareOrg(org2);
                
                if (flag == 1) {
                    System.out.println("Both organizations are same!\n");
                } else {
                    System.out.println("Both organizations are different!\n");
                }
            }
        } while (!ch.equals("exit"));
    }
}
