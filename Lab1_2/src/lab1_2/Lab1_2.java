/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1_2;
import java.util.*;
/**
 *
 * @author iiita
 */
public class Lab1_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numPages;
        int numStamps;
        int tempFraction;
        String ans;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Postage Calculation\n");
        
        do {
            System.out.println("Enter Number Of Pages: ");
            numPages = Integer.parseInt(sc.nextLine());
            numStamps = numPages / 5;
            tempFraction = numPages % 5;
            
            if (tempFraction > 0) {
                numStamps++;
            }
        
            if (numStamps > 3) {             
                System.out.println("Number of stamps > 3. Mail cannot be posted.\n");
            } else {
                System.out.println("Number of stamps: "+numStamps+"\n");
            }
            
            System.out.println("Enter more data?(y/n): ");
            ans = sc.nextLine();
        } while (!ans.equals("n"));
    }
    
}
