package com.bridgelabz.oopsprograms.cliniquemanagement; 
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;
import com.bridgelabz.utility.Util;
import com.bridgelabz.utility.Utility;
public class DoctorPatientImplementation implements DoctorAndPatientData 
{
	static ObjectMapper mapper = new ObjectMapper(); //create mapper 
	List<Patients> personlist = new ArrayList<>(); //create arraylist to store patients details
	List<Doctor> doctorlist = new ArrayList<>(); //create arraylist to store doctor details
	List<Appointment> appointmentlist = new ArrayList<>(); //create arraylist to store appointment details
	{
		try 
		{
			//read files and store data into linked list
			personlist = mapper.readValue(new File("/home/admin1/Desktop/JavaProgram/Programs/src/com/bridgelabz/oopsprograms/cliniquemanagement/Patients.json"),
					new TypeReference<List<Patients>>() {
					});
			doctorlist = mapper.readValue(new File("/home/admin1/Desktop/JavaProgram/Programs/src/com/bridgelabz/oopsprograms/cliniquemanagement/Doctors.json"),
					new TypeReference<List<Doctor>>() {
					});
			appointmentlist = mapper.readValue(new File("/home/admin1/Desktop/JavaProgram/Programs/src/com/bridgelabz/oopsprograms/cliniquemanagement/Appointment.json"),
					new TypeReference<List<Appointment>>() {
					});

		} 
		catch (Exception e)
		{

		}
	}

	int id;
	String name;
	String availability;
	String specialization;
	String phone;
	int age;
	boolean saveflag = false;
	boolean changeflag = false;
	Utility input = new Utility();

	public DoctorPatientImplementation() 
	{

	}

	@Override
	public void operation() 
	{
		int Answer = 0;
		do 
		{
			System.out.println("1. Add Doctor");
			System.out.println("2. Delete Doctor");
			System.out.println("3. Add Patients");
			System.out.println("4. Delete Patients");
			System.out.println("5. Fix Appointment ");
			System.out.println("6. Exit");
			Answer = Util.getInt();
			switch (Answer)
			{
			case 1:
				//to add doctor
				addDoctor();
				//save data
				save();
				break;
			case 2:
				//delete doctor
				deleteDoctor();
				save();//save data
				break;
			case 3:
				addPatient(); //add patient
				save();
				break;
			case 4:
				deletePatient(); //delete patient
				save();
				break;
			case 5:
				fixAppointment(); //fix appointment
				save();
				break;
			case 6:
				break;
			default:
				System.out.println("Invalid Option");
			}

		}
		while (Answer !=6);

	}

	//add new doctor to list
	@Override
	public void addDoctor() 
	{
		System.out.println("Enter Name");
		name = Util.getString();
		System.out.println("Enter Specalization");
		specialization = Util.getString();
		System.out.println("Enter Availability(AM/PM/BOTH)");
		availability = Util.getString();
		id = 0;
		if (doctorlist.size() >= 1) 
		{
			for (int i = 0; i < doctorlist.size(); i++) 
			{
				if (id < doctorlist.get(i).getId()) 
				{
					id = doctorlist.get(i).getId();
				}
			}
		}
		doctorlist.add(new Doctor(id + 1, name, availability, specialization));
	}

	//delete doctor from list
		@Override
	public void deleteDoctor() 
		{
		System.out.println("Enter Doctor id");
		id = Util.getInt();
		int i = 0;
		for (i = 0; i < doctorlist.size(); i++)
		{
			if (i == doctorlist.size()) 
			{
				System.out.println("INVALID ID");
			}
			else if (doctorlist.get(i).getId() == id)
			{
				doctorlist.remove(i);
			}
		}
		
	}

//add new patient
	public void addPatient()
	{
		changeflag = true;
		saveflag = false;
		System.out.println("Enter Patient Name");
		name = Util.getString();
		System.out.println("Enter Patient Phone Number");
		phone = Util.getString();
		System.out.println("Enter Patient Age");
		age = Util.getInt();
		id = 0;
		if (personlist.size() >= 1) 
		{
			for (int i = 0; i < personlist.size(); i++) 
			{
				if (id < personlist.get(i).getId()) 
				{
					id = personlist.get(i).getId();
				}
			}

		}
		personlist.add(new Patients(id + 1, name, phone, age));
	}

	//delete patient from list
	@Override
	public void deletePatient() 
	{
		changeflag = true;
		saveflag = false;
		System.out.println("Enter Patient id");
		id = Util.getInt();
		int i = 0;
		for (i = 0; i < personlist.size(); i++) 
		{
			if (personlist.get(i).getId() == id) 
			{
				personlist.remove(i);
			}
		}
		if (i == personlist.size()) 
		{
			System.out.println("No Patient Found With This Id");
		}
	}

	//save data
	@Override
	public void save()
	{
		try 
		{
			
			mapper.writeValue(new File("/home/admin1/Desktop/JavaProgram/Programs/src/com/bridgelabz/oopsprograms/cliniquemanagement/Patients.json"), personlist);
			mapper.writeValue(new File("/home/admin1/Desktop/JavaProgram/Programs/src/com/bridgelabz/oopsprograms/cliniquemanagement/Appointment.json"), appointmentlist);
			mapper.writeValue(new File("/home/admin1/Desktop/JavaProgram/Programs/src/com/bridgelabz/oopsprograms/cliniquemanagement/Doctors.json"), doctorlist);
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
//fix appointment
	@Override
	public void fixAppointment() 
	{
			// TODO Auto-generated method stub
		System.out.println("Enter DoctorId");
		int doctorId = Util.getInt();
		System.out.println("Enter PatientId");
		int patientId = Util.getInt();
		System.out.println("Enter Availibility");
		String avail = Util.getString();
		System.out.println("Enter Patient Phone Number");
		String patientphone = Util.getString();
		Doctor objtemp = (Doctor) doctorlist.stream().filter(i -> i.getId() == doctorId).collect(Collectors.toList())
				.get(0);
		Patients objtemp2 = (Patients) personlist.stream().filter(i -> i.getId() == patientId)
				.collect(Collectors.toList()).get(0);
		if (objtemp == null || objtemp2 == null || !(objtemp2.getPhone().equals(patientphone)))
		{
			System.out.println("Invalid Details");
			return;
		}
		if (objtemp.getAvailability().equals(avail)) 
		{
			if (objtemp.getAvailability().equals("AM"))
			{
				if (objtemp.getAmCount() > 5) 
				{
					System.out.println("Doctor Already Have Appointments");
					return;
				} 
				else 
				{
					for (int i = 0; i < doctorlist.size(); i++) 
					{
						if (doctorlist.get(i).getId() == doctorId)
                       {
							int temp = doctorlist.get(i).getAmCount();
							doctorlist.get(i).setAmCount(temp + 1);
						}
					}
				}
			}
         else if (objtemp.getAvailability().equals("PM")) 
         {
				if (objtemp.getPmCount() > 5) 
				{
					System.out.println("Doctor Already Have Appointments");
					return;
				} 
				else 
				{
					for (int i = 0; i < doctorlist.size(); i++) 
					{
						if (doctorlist.get(i).getId() == doctorId) 
						{
							int temp = doctorlist.get(i).getPmCount();
							doctorlist.get(i).setPmCount(temp + 1);
						}
					}
				}
			}
		}
		appointmentlist.add(new Appointment(objtemp.getName(), doctorId, objtemp2.getName(), patientId, patientphone, avail));
		System.out.println("Appointment Fixed");
	}

}
