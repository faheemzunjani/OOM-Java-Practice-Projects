/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_4;

public class MySortedIntArray implements MyIntSet {
    @Override
    public boolean member(int element, int[] Array, int noOfElements) {
        int i;
        boolean flag = false;
        
        for (i = 0; i < noOfElements && element >= Array[i]; i++) {
            if (element == Array[i]) {
                flag = true;
                break;
            }
        }
        
        return flag;
    }
}
