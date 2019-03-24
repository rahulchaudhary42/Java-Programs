/**********************************************************************************
	 * Purpose:  Read in the following message: Hello <<name>>, We have your full name as
	 *           <<full name>> in our system. your contact number is 91-xxxxxxxxxx. Please,let us 
	 *           know in case of any clarification Thank you BridgeLabz 01/01/2016. 
     *
	 * @author Rahul Chaudhary
	 * @version 1.2 
	 * @since  20-03-2019
	 *
	 ******************************************************************************/
package com.bridgelabz.oopsprograms;
import java.text.SimpleDateFormat;
import java.util.Date;
public class RegularExpression
{
	public static void regexExpression(String fullName, String mobile, String firstName) 
	{
		String Message = "Hello <<name>>, We have your full name "
				+ "as <<full name>> in our system. \n\t\tYour contact number is +91­xxxxxxxxxx. \n\tPlease,let us "
				+ "know in case of any clarification.\n\t\t\t Thank you!!!\n\t\t\tBridgeLabz 01/01/2016. ";
		// create regex
		String regexName = "<<name>>";
		String regexFname = "<<full name>>";
		String regexNum = "­xxxxxxxxxx";
		String regexDate = "01/01/2016";
		SimpleDateFormat Date = new SimpleDateFormat("dd/MM/yyyy");
		Date date = new Date(); // to get current time and date
		String fdate = Date.format(date);

		Message = Message.replaceAll(regexName, firstName); 
		Message = Message.replaceAll(regexFname, fullName); 
		Message = Message.replaceAll(regexNum, mobile); 
		Message = Message.replaceAll(regexDate, fdate); 
		System.out.println(Message);//display modified message
	}
	public static void main(String[] args)
	{
		regexExpression("Rahul Chaudhary", "9813911546", "Rahul");
	}
}
