/******************************************************************************
	 * Purpose: Measuring the time that elapses between the start and end clicks.
     *
	 * @author Rahul Chaudhary
	 * @version 1.2 
	 * @since 05-03-2019
	 *
	 ******************************************************************************/
package com.bridgelabz.functionalPrograms;
import com.bridgelabz.utility.Utility;
public class SimulateStopwatch 
{
   public long start=0;
   public long stop=0;
   public long elapsed;
   //create the method to show the start time of stopwatch
   public void start()
   {
	   start=System.currentTimeMillis();
	   System.out.println("start timer is:"+ start);
   }
   //create the method to show the stop time of stopwatch
   public void stop()
   {
	   stop=System.currentTimeMillis();
	   System.out.println(" Stop timer is:"+ stop);
   }
   //create the method to calculate the elapsed time 
   public long getElapsedTime()
   {
	   elapsed=stop-start;
	   return elapsed;
   }
   
   public static void main(String[] args) 
   {
	 //Create the object of Stopwatch to access the methods & the variables ...
	 SimulateStopwatch ssw=new SimulateStopwatch();
	 Utility u =new Utility();
	 System.out.println(" Press 1 to get the starttime of Stopwatch..");
	 u.inputInteger();
	 ssw.start();
	 
	 System.out.println(" Press 2 to get the stoptime of Stopwatch..");
	 u.inputInteger();
	 ssw.stop();
	 //calling the elapsed method 
	 long l=ssw.getElapsedTime();
	 System.out.println("Total time elapsed in millisec is "+l );
	 System.out.println();
	 System.out.println("Total time elasped in seconds is "+(l/1000)+"sec");
   }
}
