/******************************************************************************
	 * Purpose:  This programme is used to manage a list of Doctors associated with the Clinique. 
	 *           This also manages the list of patients who use the clinique.
     *
	 * @author Rahul Chaudhary
	 * @version 1.2 
	 * @since 18-03-2019
	 *
	 ******************************************************************************/
package com.bridgelabz.oopsprograms.inventorymanager;
import java.io.FileReader;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
public class InventoryManagement 
{

	public static void getData(String readFor, String arg1, String arg2, String arg3)
	{
		JSONParser parser = new JSONParser();
		try 
		{
			// parse file
			Object obj = parser.parse(
					new FileReader("/home/admin1/Desktop/JavaProgram/Programs/src/Inventory.txt"));
			JSONObject jsonObject = (JSONObject) obj; //convert file data into json object
			JSONArray values = (JSONArray) jsonObject.get(readFor); //read details into json array
			System.out.println("\n" + readFor + " details............");

			for (int i = 0; i < values.size(); i++) {
				//display data
				JSONObject rice = (JSONObject) values.get(i);
				String name = (String) rice.get(arg1);
				String we = (String) rice.get(arg2);
				String prize = (String) rice.get(arg3);
				System.out.println(
						(i + 1) + "--> " + arg1 + ":" + name + ", " + arg2 + ":" + we + ", " + arg3 + ":" + prize);
				int a = Integer.parseInt(we);
				int b = Integer.parseInt(prize);
				System.out.println("\tTotal Prize:" + a * b); //dispaly total prize for shares
			}

		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}

	}
	public static void main(String[] args) 
	{
		getData("Rice", "Ricename", "Weight", "Price");
		getData("Wheat", "Wheatname", "Weight", "Price");
		getData("Pulses", "Pulsesname", "Weight", "Price");
	}
}
