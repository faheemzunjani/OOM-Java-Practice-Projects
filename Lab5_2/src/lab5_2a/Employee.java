/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5_2a;
import com.person.*;
import com.address.*;

public class Employee {
    String empID;
    String company;
    Person person;
    Address address;
    
    public Employee(String eID, String comp, String name, long phone, String house, String street, String city) {
        empID = eID;
        company = comp;
        
        person = new Person(name, phone);
        address = new Address(house, street, city);
    }
}
