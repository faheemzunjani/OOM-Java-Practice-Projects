/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_1;

public class Lab4_1 
{
    public enum SEASON
    {
        WINTER(4),
	SPRING(2),
	SUMMER(4),
	FALL(2);
	
	private int season;
        
	SEASON(int dr)
	{
            season = dr;
	}
	
	public int GetSeason()
	{
            return season;
	}
    }
	  
    public static void main(String[] args) 
    {

        for(SEASON currentSeason : SEASON.values()) {
	      		System.out.println(currentSeason + " is " + currentSeason.GetSeason() + " months long \n");
        }
    }
}

