package com.bridgelabz.oopsprograms.commercialdataprocessing;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/**
 * these are the methods of LinkedList
 * such as add user ,buy stock,sell stock,print details,print report
 *  
 */
public class CommercialLLMethods 
{
	LinkedList list ;
	LinkedList list1 ;
	Scanner sc = new Scanner(System.in);
	String companyFilePath = "/home/admin1/Desktop/JavaProgram/Programs/src/com/bridgelabz/oopsprograms/commercialdataprocessing/Company.json";
	String userFilePath = "/home/admin1/Desktop/JavaProgram/Programs/src/com/bridgelabz/oopsprograms/commercialdataprocessing/UserStock.json";
	CommercialCompanyPojo companyPojo = new CommercialCompanyPojo();
	public void addDetails() throws Exception
	{
		System.out.println("Enter Whose details you want to add\n1.Company Stock\n2.User Deatils");
		int choice = sc.nextInt();
		switch(choice)
		{
		case 1:
			addStockDetails();				
			break;
		case 2:
			addUser();
			break;
		default:
			System.out.println("Invalid choice...!!!");
			System.out.println("Do you wants to enter again...(Y/N)");
			char ch = sc.next().charAt(0);
			if(ch == 'Y' || ch == 'y')
				addDetails();
		}
	}	
	public void addStockDetails() throws Exception
	{
		File file = new File(companyFilePath);
		System.out.println("Enter Stock name : ");
		String stockName = sc.next();
		companyPojo.setStockName(stockName);

		System.out.println("Enter stock symbol : ");
		String stockSymbol = sc.next();
		companyPojo.setStockSymbol(stockSymbol);

		System.out.println("Enter no. of share : ");
		String noOfShare = sc.next();
		companyPojo.setNoOFShare(noOfShare);

		System.out.println("Enter share Price : ");
		String sharePrice = sc.next();
		companyPojo.setSharePrice(sharePrice);		
		createCompanyJsonObj(companyPojo ,file);
	}
	@SuppressWarnings("unchecked")
	public void createCompanyJsonObj(CommercialCompanyPojo companyPojo ,File file) throws Exception
	{
		JSONParser parser = new JSONParser();		 
		JSONObject jsonObj = (JSONObject)parser.parse(new FileReader(file));
		JSONArray jsonArray =(JSONArray)jsonObj.get("StockDetails");
		JSONObject simple = new JSONObject();
		simple.put("StockName",companyPojo.getStockName());
		simple.put("StockSymbol", companyPojo.getStockSymbol());
		simple.put("NoOfShare", companyPojo.getNoOFShare());
		simple.put("SharePrice", companyPojo.getSharePrice());
		jsonArray.add(simple);
		jsonObj.put("StockDetails", jsonArray);
		System.out.println(jsonObj);
		writeIntoFile(jsonObj , companyFilePath);		
	}
	private void writeIntoFile(JSONObject jsonObj2 , String filePath) throws Exception 
	{
		File file = new File(filePath);
		@SuppressWarnings("resource")
		FileWriter writer = new FileWriter(file);
		writer.write(jsonObj2.toString());
		writer.flush();
	}	
	public void addUser() throws Exception
	{
		CommercialUserPojo userPojo = new CommercialUserPojo();
		File file = new File(userFilePath);
		System.out.println("Enter User name : ");
		String userName = sc.next();
		userPojo.setUserName(userName);

		System.out.println("Enter no. of share : ");
		String noOfShare = sc.next();
		userPojo.setNoOfShares(noOfShare);

		System.out.println("Enter share price : ");
		String sharePrice = sc.next();
		userPojo.setPrice(sharePrice);					
		createUserJsonObj(userPojo ,file);
	}	
	
	@SuppressWarnings("unchecked")
	public void createUserJsonObj(CommercialUserPojo userPojo , File file) throws Exception
	{
		JSONParser parser = new JSONParser();		 
		JSONObject jsonObj = (JSONObject)parser.parse(new FileReader(file));
		JSONArray jsonArray =(JSONArray)jsonObj.get("UserDetails");
		JSONObject simple = new JSONObject();
		simple.put("UserName",userPojo.getUserName());
		simple.put("NoOfShare", userPojo.getNoOfShares());
		simple.put("SharePrice", userPojo.getPrice());
		jsonArray.add(simple);
		jsonObj.put("UserDetails", jsonArray);
		System.out.println(jsonObj);
		writeIntoFile(jsonObj ,userFilePath );
	}	

	@SuppressWarnings("unchecked")
	public void buyStock() throws Exception
	{
		File file1 = new File(companyFilePath);
		JSONParser parser1 = new JSONParser();
		JSONObject jsonObj1 = (JSONObject)parser1.parse(new FileReader(file1));
		JSONArray array1 = (JSONArray)jsonObj1.get("StockDetails"); 
		System.out.println(array1);

		File file2 = new File(userFilePath);
		JSONParser parser2 = new JSONParser();
		JSONObject jsonObj2 = (JSONObject)parser2.parse(new FileReader(file2));
		JSONArray array2 = (JSONArray)jsonObj2.get("UserDetails");
		System.out.println(array2);
		JSONObject compareObj1;
		JSONObject compareObj2;
		System.out.println("Enter User name : ");
		String userName = sc.next();
		for(int i = 0;i<array2.size();i++)
		{
			compareObj2 = (JSONObject)array2.get(i);
			if(compareObj2.get("UserName").equals(userName))
			{
				System.out.print(compareObj2);
				System.out.println("\nFollowing is available stock list");
				for(i=0 ; i<array1.size();i++)
				{
					compareObj1 = (JSONObject)array1.get(i);
					System.out.println(compareObj1);
				}
				System.out.println("Enter Stock Name from above list ");
				String stockName = sc.next();
				for(i=0 ; i<array1.size();i++)
				{
					compareObj1 = (JSONObject)array1.get(i);
					if(compareObj1.get("StockName").equals(stockName)) 
					{
						System.out.println(compareObj1);
						System.out.println("Enter how many stocks you want to buy");
						int stocksToBuy = sc.nextInt();

						int companyIntStocks = Integer.parseInt(compareObj1.get("NoOfShare").toString());
						int userIntStocks = Integer.parseInt(compareObj2.get("NoOfShare").toString());
						int userSharePrice = Integer.parseInt(compareObj2.get("SharePrice").toString());
						int companySharePrice = Integer.parseInt(compareObj1.get("SharePrice").toString());
						@SuppressWarnings("unused")
						String stockSymbol = compareObj1.get("StockSymbol").toString();

						int newUserShares = userIntStocks + stocksToBuy;
						int newCompanyShares = companyIntStocks - stocksToBuy;

						int priceOfEachShare = companySharePrice / companyIntStocks;
						int newStockCalculation = (priceOfEachShare * stocksToBuy);
						int newComapnySharePrice=  companySharePrice + newStockCalculation ;						
						int newUserSharePrice = userSharePrice - newStockCalculation;


						if(companyIntStocks > stocksToBuy && userSharePrice > newStockCalculation)
						{						
							compareObj1.remove("NoOfShare");
							compareObj2.remove("NoOfShare");
							compareObj1.remove("SharePrice");
							compareObj2.remove("SharePrice");

							compareObj1.put("NoOfShare", newCompanyShares);
							compareObj2.put("NoOfShare", newUserShares);
							compareObj1.put("SharePrice", newComapnySharePrice);
							compareObj2.put("SharePrice", newUserSharePrice);

							System.out.println(compareObj1);
							System.out.println(compareObj2);

							Date dateObj = new Date();
							String date = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a").format(dateObj);
							System.out.println("Shares Buy Date & Time : " + date);
						}
						else
							System.out.println("Sorry.!!! Insufficient amount or shares not available....");
					}
				}
			}
		}
		writeIntoFile(jsonObj1, companyFilePath);
		writeIntoFile(jsonObj2, userFilePath);
	}

	public void linkedlist() throws Exception
	{
		list = new LinkedList();
		list1 = new LinkedList();

		File file1 = new File(companyFilePath);
		JSONParser parser1 = new JSONParser();
		JSONObject jsonObj1 = (JSONObject)parser1.parse(new FileReader(file1));
		JSONArray array1 = (JSONArray)jsonObj1.get("StockDetails");

		File file2 = new File(userFilePath);
		JSONParser parser2 = new JSONParser();
		JSONObject jsonObj2 = (JSONObject)parser2.parse(new FileReader(file2));
		JSONArray array2 = (JSONArray)jsonObj2.get("UserDetails");

		JSONObject obj;
		for(int i=0;i<array1.size();i++) 
		{
			obj = (JSONObject)array1.get(i);
			String str = obj.get("NoOfShare").toString();
			list.insert(str);
		}	
		list.show();

		for(int i = 0;i<array2.size();i++)
		{
			obj = (JSONObject)array2.get(i);
			String str = obj.get("NoOfShare").toString();
			list1.insert(str);
		}
		list1.show();
	}

	@SuppressWarnings("unchecked")
	public void sellStock() throws Exception
	{		
		File file1 = new File(companyFilePath);
		JSONParser parser1 = new JSONParser();
		JSONObject jsonObj1 = (JSONObject)parser1.parse(new FileReader(file1));
		JSONArray array1 = (JSONArray)jsonObj1.get("StockDetails"); 
		System.out.println(array1);		
		File file2 = new File(userFilePath);
		JSONParser parser2 = new JSONParser();
		JSONObject jsonObj2 = (JSONObject)parser2.parse(new FileReader(file2));
		JSONArray array2 = (JSONArray)jsonObj2.get("UserDetails");
		System.out.println(array2);
		JSONObject compareObj1;
		JSONObject compareObj2;
		System.out.println("Enter User name : ");
		String userName = sc.next();
		for(int i = 0;i<array2.size();i++)
		{
			compareObj2 = (JSONObject)array2.get(i);
			if(compareObj2.get("UserName").equals(userName))
			{
				//isUserPresent = true;
				System.out.print(compareObj2);
				System.out.println("\nFollowing is available stock list");
				for(i=0 ; i<array1.size();i++)
				{
					compareObj1 = (JSONObject)array1.get(i);
					System.out.println(compareObj1);
				}
				System.out.println("Enter name of stock to whom you want to buy shares ");
				String stockName = sc.next();
				for(i = 0 ; i<array1.size();i++)
				{
					compareObj1 = (JSONObject)array1.get(i);
					if(compareObj1.get("StockName").equals(stockName))
					{
						//isStockPresent = true;
						System.out.println(compareObj1);	

						System.out.println("How many shares you wants to sell ? ");
						int sellShares = sc.nextInt();


						int companyIntStocks = Integer.parseInt(compareObj1.get("NoOfShare").toString());
						int userIntStocks = Integer.parseInt(compareObj2.get("NoOfShare").toString());
						int userSharePrice = Integer.parseInt(compareObj2.get("SharePrice").toString());
						int companySharePrice = Integer.parseInt(compareObj1.get("SharePrice").toString());

						int newUserShares = userIntStocks - sellShares;
						int newCompanyShares = companyIntStocks + sellShares;							

						int priceOfEachUserShares = userSharePrice / userIntStocks; 
						int newShareCalculation =  priceOfEachUserShares * sellShares;
						int newUserSharePrice = userSharePrice + newShareCalculation;
						int newCompanySharePrice = companySharePrice - newShareCalculation ; 

						if(sellShares < userIntStocks && newShareCalculation < companySharePrice )
						{
							compareObj1.remove("NoOfShare");
							compareObj2.remove("NoOfShare");
							compareObj1.remove("SharePrice");
							compareObj2.remove("SharePrice");

							compareObj1.put("NoOfShare", newCompanyShares);
							compareObj2.put("NoOfShare", newUserShares);
							compareObj1.put("SharePrice", newCompanySharePrice);
							compareObj2.put("SharePrice", newUserSharePrice);

							System.out.println(compareObj1);
							System.out.println(compareObj2);					

							Date dateObj = new Date();
							String date = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a").format(dateObj);
							System.out.println("Shares Sell Date & Time : " + date);
						}
					}
				}	
			}
		}		
		/*
		writeIntoFile(jsonObj1, companyFilePath);
		writeIntoFile(jsonObj2, userFilePath);*/
	}	
	public void printReport() throws Exception
	{
		CommercialLLMethods stock = new CommercialLLMethods();
		System.out.println("Whose data you want to see\n1. Company\t2. User");
		int reportchoice = sc.nextInt();
		switch (reportchoice) 
		{
		case 1:
			stock.printCompanyReport();						
			break;
		case 2:
			stock.printUserReport();
			break;
		default:
			System.out.println("Invalid choice");
		}		
	}
	public void  printCompanyReport() throws Exception
	{
		File file = new File(companyFilePath);
		JSONParser parser = new JSONParser();
		JSONObject jsonObj = (JSONObject)parser.parse(new FileReader(file));
		JSONArray array = (JSONArray)jsonObj.get("StockDetails");
		System.out.println(array);
	}
	public void printUserReport() throws Exception
	{
		File file = new File(userFilePath);
		JSONParser parser = new JSONParser();
		JSONObject jsonObj = (JSONObject)parser.parse(new FileReader(file));
		JSONArray array = (JSONArray)jsonObj.get("UserDetails");
		System.out.println(array);
	}

}