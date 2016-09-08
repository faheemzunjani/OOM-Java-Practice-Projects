/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_3;

public class Employee extends Organization {
    String empName;
    String sex;
    String jobTitle;
    String birthDate;
    
    public void setEmpData(String name, String gender, String title, String birthdate, String nameOfOrg) {
        empName = name;
        sex = gender;
        jobTitle = title;
        birthDate = birthdate;
        orgName = nameOfOrg;
    }

    public int compareEmp(Employee emp2) {
        int flag;
        
        if (this.empName.equals(emp2.empName) && this.sex.equals(emp2.sex) && this.jobTitle.equals(emp2.jobTitle) && this.birthDate.equals(emp2.birthDate) && this.orgName.equals(emp2.orgName)) {
            flag = 1;
        } else {
            flag = 0;
        }
        
        return flag;
    }
}
