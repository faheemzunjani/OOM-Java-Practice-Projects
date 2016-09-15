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
        Scanner sc = new Scanner(System.in);
        String[] argv = new String[4];
        argv[0] = "Lab3_4.java";
        argv[1] = sc.nextLine();
        argv[2] = "test.txt";
        
        try {
            FileReader fr = new FileReader(argv[2]);
            BufferedReader br = new BufferedReader(fr);
            
            N = 0;
            
            while((line = br.readLine()) != null) {
                array[N] = Integer.parseInt(line);
                N++;
            }
            br.close(); 
            
            MySortedIntArray sArray = new MySortedIntArray();
            
            if (sArray.member(Integer.parseInt(argv[1]), array, N)) {
                System.out.println("true\n");
            } else {
                System.out.println("false\n");
            }
                    
        } catch(FileNotFoundException ex) {
            System.out.println("Unable to open file '" + argv[2] + "'");                
        } catch(IOException ex) {
            System.out.println("Error reading file '" + argv[2] + "'");
        }
   }  
}
