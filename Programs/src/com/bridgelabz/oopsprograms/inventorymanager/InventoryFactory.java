package com.bridgelabz.oopsprograms.inventorymanager;
public class InventoryFactory 
{
	private String inventoryName;
	private int inventoryNumber;
	private int inventoryValue;
   
	public void setinventoryname(String inventoryname)
		{
			this.inventoryName=inventoryname;
		}
		
		public void setinventorynumber(int inventorynumber)
		{
			this.inventoryNumber=inventorynumber;
		}
		
		public void setinventoryvalue(int inventoryvalue)
		{
			this.inventoryValue=inventoryvalue;
		}
		public String getinventoryname()
		{
			return this.inventoryName;
		}
		
		public int getinventorynumber()
		{
			return this.inventoryNumber;
		}
		
		public int getinventoryvalue()
		{
			return this.inventoryValue;
		}

}
