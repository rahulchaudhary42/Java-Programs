/**********************************************************************************
	 * Purpose:  Create a JSON file having Inventory Details for Rice, Pulses and Wheats 
	 *           with properties name, weight, price per kg. 
     *
	 * @author Rahul Chaudhary
	 * @version 1.2 
	 * @since  18-03-2019
	 *
	 ******************************************************************************/
package com.bridgelabz.oopsprograms;
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;
import com.bridgelabz.utility.Util;
public class InventoryManager 
{
	private static ObjectMapper mapper = new ObjectMapper();
	static LinkedList<InventoryFactory> details = new LinkedList<>();  
	static LinkedList<InventoryFactory> data = new LinkedList<>();
	public static void main(String args[]) throws Exception 
	{
		int Option = 0;
		 
		InventoryFactory fact = new InventoryFactory(); 
		do 
		{
			System.out.println("\n1. Add data to Inventory");
			System.out.println("2. Remove data from Inventory");
			System.out.println("3. display");
			System.out.println("4. For Exit");
			Option = Util.getInt();
			switch (Option) 
			{
			case 1:
				System.out.println("Enter product Name:");
				String name = Util.getString();
				 
				System.out.println("Enter product stock in kg:");
				int number = Util.getInt();
				 
				System.out.println("Enter Price");
				 int price = Util.getInt();
				 
				fact.setproductname(name);
				fact.settotalStock(number);
				fact.setstockValue(price);
				save(fact);
				System.out.println("data added successfully ");
				break;

			case 2:
				removeData();
				System.out.println("data removed successfully");
				break;
			case 3:
				displayInformation();
				break;
			case 4:
				break;
			default:
				System.out.println("Invalid Entry Retype");
			}

		} 
		while (Option != 4);
      
	}

 
	private static void removeData() throws JsonMappingException, IOException 
	{
		System.out.println("Enter product name");
		String productName = Util.getString();
	 
		LinkedList<InventoryFactory> data1 = mapper.readValue(
				new File(
						"/home/admin1/Desktop/JavaProgram/Programs/src/InventoryManager.json"),
				new TypeReference<LinkedList<InventoryFactory>>() {
				});
		int i = 0;
		for (i = 0; i < data1.size(); i++) 
		{
			if (data1.get(i).getproductname().equals(productName)) 
			{
				data1.remove(i);  
			}

			else if (i == data1.size()) {
				System.out.println("Invalid ");
			}
		 
			mapper.writeValue(new File(
					"/home/admin1/Desktop/JavaProgram/Programs/src/InventoryManager.json"),
					data1);
		}
	}

	 
	public static void displayInformation() throws JsonMappingException, IOException 
	{
		 
		LinkedList<InventoryFactory> data2 = mapper.readValue(
				new File(
						"/home/admin1/Desktop/JavaProgram/Programs/src/InventoryManager.json"),
				new TypeReference<LinkedList<InventoryFactory>>() {
				});
		int size = data2.size();  
		if (size == 0)  
			System.out.println("data not found");
		 
		else 
		{
			System.out.println("Name\tstock\tvalue\n");
			data2.stream().forEach(i -> {
				System.out.println(i.getproductname() + "\t  " + i.gettotalStock() + "\t" + i.getstockValue()
						+ " \n Total value for " + i.getproductname() + " is:"
						+ (i.gettotalStock() * i.getstockValue()));
			});
		}
	}

 
	public static void save(InventoryFactory fact) throws JsonMappingException, IOException 
	{
	 
		data = mapper.readValue(
				new File(
						"/home/admin1/Desktop/JavaProgram/Programs/src/InventoryManager.json"),
				new TypeReference<LinkedList<InventoryFactory>>() {
				});
		data.add(fact); 
		mapper.writeValue(
				new File(
						"/home/admin1/Desktop/JavaProgram/Programs/src/InventoryManager.json"),
				data);
	}
}
