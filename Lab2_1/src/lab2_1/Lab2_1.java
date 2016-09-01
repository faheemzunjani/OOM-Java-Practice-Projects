/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_1;
import java.util.*;

public class Lab2_1 {
    public static int findSum(int[] array) {
        int sum;
        
        sum = 0;
        
        for (int i = 0; i < 10; i++) {
            sum += array[i];
        }
        
        return sum;
    }
    
    public static int findSum(int[] array, String ch) {
        int sum;
        
        sum = 0;
        
        if (ch.equals("f")) {
            for (int i = 0; i < 5; i++) {
                sum += array[i];
            }
        } else {
            for (int i = 5; i < 10; i++) {
                sum += array[i];
            }
        }
        
        return sum;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        int[] array = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        Scanner sc = new Scanner(System.in);
        String ch;
        
        System.out.println("Enter 10 integers: ");
        
        for (int i = 0; i < 10; i++) {
            array[i] = Integer.parseInt(sc.nextLine());
        }
        
        System.out.println("Enter choice: ");
        ch = sc.nextLine();
        
        if (ch.equals("a")) {
            System.out.println("Sum: "+ findSum(array) + "\n");
        } else {
            System.out.println("Sum: "+ findSum(array, ch) + "\n");
        }
    }
    
}
