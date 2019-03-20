package com.bridgelabz.oopsprograms;
import java.text.SimpleDateFormat;
import java.util.Date;
public class RegularExpression
{
	public static void regexExpression(String fullName, String mobile, String firstName) 
	{
		// your message to be displayed
		String Message = "Hello <<name>>, We have your full name "
				+ "as <<full name>> in our system. \nYour contact number is +91­xxxxxxxxxx. \nPlease,let us "
				+ "know in case of any clarification.\n\t\t\t Thank you!!!\n\t\t\t BridgeLabz 01/01/2016. ";
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
