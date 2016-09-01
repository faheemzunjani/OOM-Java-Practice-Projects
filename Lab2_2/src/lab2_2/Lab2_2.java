/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_2;
import java.util.*;

public class Lab2_2 {

    public static void main(String[] args) {
        Student stud1 = new Student();
        Student stud2 = new Student();
        Scanner sc = new Scanner(System.in);
        String studName;
        String studRNo;
        int studAge;
        
        stud1.SetData("Faheem", "IIT2015113", 19);
        
        System.out.println("Enter details of student 2:\n");
        System.out.println("Enter name: ");
        studName = sc.nextLine();
        System.out.println("Enter roll no: ");
        studRNo = sc.nextLine();
        System.out.println("Enter age: ");
        studAge = Integer.parseInt(sc.nextLine());
        
        stud2.SetData(studName, studRNo, studAge);
        
        System.out.println("Student 1: \n");
        stud1.GetData();
        System.out.println("Studetn 2: \n");
        stud2.GetData();
    }
    
}
