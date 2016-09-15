/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_4;

/**
 *
 * @author islahul
 */
public class MySortedIntArray implements MyIntSet {
    @Override
    public boolean member(int element, int[] array, int noOfElements) {
        int i;
        
        for (i = 0; i < noOfElements; i++) {
            if (element == array[i]) {
                return true;
            } else if (element > array[i]) {
                return false;
            }
        }
    return false;
    }
}
