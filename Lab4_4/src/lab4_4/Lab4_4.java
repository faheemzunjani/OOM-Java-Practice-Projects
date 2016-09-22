/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_4;
import java.util.*;

public class Lab4_4
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);		
		
		System.out.println("Enter Basic Pay Of Manager : ");
		int basic_pay1 = sc.nextInt();
		System.out.println("\nEnter Basic Pay Of Typist : ");
		int basic_pay2 = sc.nextInt();
		System.out.println("\nEnter Basic Pay Of Officer : ");
		int basic_pay3 = sc.nextInt();
		System.out.println("\n");

		Manager emp1 = new Manager(basic_pay1,1,"M","Sydney", 9999);
		Typist emp2 = new Typist(basic_pay2,2,"T","Ibiza", 9999);
		Officer emp3 = new Officer(basic_pay3,3,"O","Miami", 9999);

		System.out.println("Manager Earns : " + emp1.salary());
		System.out.println("Typist Earns : " + emp2.salary());
		System.out.println("Officer Earns : " + emp3.salary());
	}
}
