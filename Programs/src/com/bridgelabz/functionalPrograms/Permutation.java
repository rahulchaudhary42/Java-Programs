/******************************************************************************
	 * Purpose: static functions to return all permutation of a String using
     *          iterative method and Recursion method.
     *
	 * @author Rahul Chaudhary
	 * @version 1.2 
	 * @since  05-03-2019
	 *
	 ******************************************************************************/
package com.bridgelabz.functionalPrograms;
public class Permutation 
{
	public static void main(String[] args) 
	{
		String str = "ABC";
		int n = str.length();
		Permutation permutation = new Permutation();
		permutation.permute(str, 0, n - 1);
	}
	/**
	 * create the method name permute.
	 * 
	 * @param str
	 *            string to calculate permutation for
	 * @param l
	 *            starting index
	 * @param r
	 *            end index
	 */
	private void permute(String str, int l, int r) 
	{
		if (l == r)
			System.out.println(str);
		else {
			for (int i = l; i <= r; i++)
			{
				str = swap(str, l, i);
				permute(str, l + 1, r);
				str = swap(str, l, i);
			}
		}
	}
	

	/**
	 * Swap characters at position
	 * 
	 * @param a
	 *            string value
	 * @param i
	 *            position 1
	 * @param j
	 *            position 2
	 * @return swapped string
	 */
	public String swap(String a, int i, int j) 
	{
		char temp;
		char[] charArray = a.toCharArray();
		temp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = temp;
		return String.valueOf(charArray);
	}
}