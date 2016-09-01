/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_4;
import java.util.*;
public class Lab2_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        CodeTimer ct = new CodeTimer();
        String ch;
        
        System.out.println("Press 'e' to end: ");
        ch = sc.nextLine();
        ct.end();
        
        System.out.println("Elapsed Time: " + ct.getElapsedTime());
        
    }
    
}
