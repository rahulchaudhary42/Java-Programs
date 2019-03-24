package com.bridgelabz.oopsprograms.addressbook;
 

public class AddressBookProj 
{
	public String firstName;
	public String lastName;
	public String address;
	public String city;
	public String state;
	public String zipCode;
	public String phnno;
	
	public AddressBookProj()
	{
		
	}	
	public AddressBookProj(String firstName, String lastName, String address, String city, String state, String zipCode,
			String phnno) 
	{
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.phnno = phnno;
	}

	public String getFirstName() 
	{
		return firstName;
	}
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	public String getLastName() 
	{
		return lastName;
	}
	public void setLastName(String lastName) 
	{
		this.lastName = lastName;
	}
	public String getAddress() 
	{
		return address;
	}
	public void setAddress(String address)
	{
		this.address = address;
	}
	public String getCity() 
	{
		return city;
	}
	public void setCity(String city) 
	{
		this.city = city;
	}
	public String getState() 
	{
		return state;
	}
	public void setState(String state) 
	{
		this.state = state;
	}
	public String getZipCode() 
	{
		return zipCode;
	}
	public void setZipCode(String zipCode) 
	{
		this.zipCode = zipCode;
	}
	public String getPhnno() 
	{
		return phnno;
	}
	public void setPhnno(String phnno) 
	{
		this.phnno = phnno;
	}
}