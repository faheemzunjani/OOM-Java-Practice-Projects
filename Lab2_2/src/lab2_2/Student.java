/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_2;

public class Student {
    private String name;
    private String rollNo;
    private int age;
    
    public void SetData(String studentName, String studentRNo, int studentAge) {
        name = studentName;
        rollNo = studentRNo;
        age = studentAge;
    }
    
    public void GetData() {
        System.out.println("Name: " + name + "\n");
        System.out.println("Roll No: " + rollNo + "\n");
        System.out.println("Age: " + age + "\n");
    }
}
