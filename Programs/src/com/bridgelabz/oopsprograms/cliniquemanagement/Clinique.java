/******************************************************************************
	 * Purpose:  This programme is used to manage a list of Doctors associated with the Clinique. 
	 *           This also manages the list of patients who use the clinique.
     *
	 * @author Rahul Chaudhary
	 * @version 1.2 
	 * @since 20-03-2019
	 *
	 ******************************************************************************/
package com.bridgelabz.oopsprograms.cliniquemanagement;
import java.text.ParseException;
import java.util.Date;
import com.bridgelabz.utility.Util;
public class Clinique 
{
	static Date date;
	public static void main(String[] args) throws ParseException 
	{
		int choice = 0;
		do 
		{
			System.out.println("\tClinique Management Programme.");
			System.out.println(
					"\n1. Add Doctor or Patient or fix an Appointment or Delete\n2. Search doctor\n3. Display details\n4. Close");
			choice = Util.getInt();
			switch (choice) 
			{
			case 1:
				new DoctorPatientImplementation().operation(); // to add doctor or patients details or to fix appointment
				break;
			case 2:
				new SearchingImplementation().operation(); // to search doctor details
				break;
			case 3:
				new InformationDisplayImplementation().operation(); 	// to display information
				break;
			case 4:
				System.out.println("Exiting");
				break;
			default:
				System.err.println("Invalid Entry...");
			}
		} 
		while (choice != 4);
	}
}