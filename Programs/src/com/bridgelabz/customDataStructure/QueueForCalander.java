package com.bridgelabz.customDataStructure;

public class QueueForCalander 
{
	static QueueForCalander qc=new QueueForCalander();
	
	public static void calenderQueue(int month, int year) 
	{
		String s[] = { "January", "Februry", "March", "April", "May", "June", "July", "August", "September", "October",
				"November", "December" };
		Queue<String> q1 = new Queue<>();
		// get d0 value hence upto d0 we will add null values
		int d = 1, y = year, m = month;
		int y0 = y - (14 - m) / 12;
		int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
		int m0 = m + 12 * ((14 - m) / 12) - 2;
		int d0 = (d + x + 31 * m0 / 12) % 7;

		int start = d0;
		int totalDaysOfMonth = 0, count = 1;
		if (month == 2) 
		{
			if (QueueForCalander.isLeapYear(year)) // if leap year days = 29
				totalDaysOfMonth = 29;
			else
				totalDaysOfMonth = 28; // if not leap year days= 28
		} else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
			totalDaysOfMonth = 31;
		else
			totalDaysOfMonth = 30;

		while (start != 0) {
			q1.enque("   ");
			start--;
		}

		while (count <= totalDaysOfMonth) {
			if (count <= 9)
				q1.enque(String.valueOf(count) + "  "); // add data to the queue
			else
				q1.enque(String.valueOf(count) + " "); // add data to the queue
			count++;
		}

		System.out.println(s[month - 1] + " " + year);
		System.out.println("S  M  T  W  T  F  S");
		count = 1;
		while (!q1.isEmpty()) // traverse till queue is not empty
		{
			String result = q1.deque();
			System.out.print(result);
			if (count % 7 == 0) {
				System.out.println();
			}
			count++;
		}
	}
	public static boolean isLeapYear(int year) {
	 
		if (year % 4 == 0 || year % 400 == 0 && year % 100 != 0)
			return true;
		else
			return false;
	}


}
