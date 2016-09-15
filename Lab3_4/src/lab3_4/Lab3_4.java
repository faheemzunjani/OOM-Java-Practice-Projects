/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_4;
import java.io.*;
import java.util.*;

public class Lab3_4 {
   public static void main(String[] args) {
        int tempElem;
        String line;
        int N;
        int[] array = new int[100];
        
        
        try {
            FileReader fr = new FileReader(args[2]);
            BufferedReader br = new BufferedReader(fr);
            
            N = 0;
            
            while((line = br.readLine()) != null) {
                array[N] = Integer.parseInt(line);
                N++;
            }
            br.close(); 
            
            MySortedIntArray sArray = new MySortedIntArray();
            
            if (sArray.member(Integer.parseInt(args[1]), array, N) == true) {
                System.out.println("true\n");
            } else {
                System.out.println("false\n");
            }
                    
        } catch(FileNotFoundException ex) {
            System.out.println("Unable to open file '" + args[2] + "'");                
        } catch(IOException ex) {
            System.out.println("Error reading file '" + args[2] + "'");
        }
   }  
}
