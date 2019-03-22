/**********************************************************************************
	 * Purpose: Write a program to read in Stock Names, Number of Share, Share Price. Print a Stock
	 *          Report with total value of each Stock and the total value of Stock.
     *
	 * @author Rahul Chaudhary
	 * @version 1.2 
	 * @since  20-03-2019
	 *
	 ******************************************************************************/
package com.bridgelabz.oopsprograms;
import java.io.FileReader;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
public class StockDetails 
{
	public static void main(String[] args) 
	{
		long totalShareCount = 0, totalSharePrize = 0;
		JSONParser parser = new JSONParser(); //object of parser
		try 
		{
			//parse file data into obj
			Object obj = parser.parse
					(new FileReader("/home/admin1/Desktop/JavaProgram/Programs/src/stock.txt"));
			JSONObject jsonObject = (JSONObject) obj; //convert obj into json object
			JSONArray values = (JSONArray) jsonObject.get("Stock"); //read stock data into json array
			
			
			System.out.println(" Stock details.......................");
			for (int i = 0; i < values.size(); i++)
			{
				//display data
				JSONObject stockk = (JSONObject) values.get(i);
				String name = (String) stockk.get("Stock_Name");
				String number = (String) stockk.get("Number_of_shares");
				String prize = (String) stockk.get("Share_Prize");
				int noOfShares = Integer.parseInt(number);
				int shareValue = Integer.parseInt(prize);
				System.out.println((i + 1) + "--> \t Stock_Name: " + name + ", \n\t Number_of_shares: " + number
						+ ",\n\tShare_prize: " + prize);
				int totalValue = noOfShares * shareValue;
				System.out.println("\tTotal share value:" + totalValue);
				totalShareCount = totalShareCount + noOfShares; //total share for all companies
				totalSharePrize = totalSharePrize + totalValue; //total share price for all company shares
			}
			System.out.println("\nTotal shares for all companies: " + totalShareCount);
			System.out.println("Total share prize for all company shares: " + totalSharePrize);
		} 
		catch (Exception e) 
		{
			e.printStackTrace(); 
		}

	}
}

