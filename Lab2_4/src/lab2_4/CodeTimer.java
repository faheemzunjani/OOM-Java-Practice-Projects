/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_4;

public class CodeTimer {
    private long startTime;
    private long endTime;
    
    CodeTimer() {
        startTime = System.currentTimeMillis();
    }
    public long getStartTime() {
        return startTime;
    }
    
    public long getEndTime() {
        return endTime;
    }
    
    public void start() {
        startTime = System.currentTimeMillis();
    }
    
    public void end() {
        endTime = System.currentTimeMillis();
    }
    
    public long getElapsedTime() {
        return (endTime - startTime);
    }
}
