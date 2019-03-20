/******************************************************************************
	 * Purpose:  Write a program with Static Functions to do Merge Sort of list of Strings. 
     *
	 * @author Rahul Chaudhary
	 * @version 1.2 
	 * @since 07-03-2019
	 *
	 ******************************************************************************/
package com.bridgelabz.algorithmPrograms;
public class MergeSort
{
	int array[];
	int tempMegreArr[];
	int length;
	public static void main(String[] args)
	{
		int inputArr[] = { 48, 36, 13, 52, 19, 94, 21 };
		MergeSort ms = new MergeSort();
		ms.sort(inputArr);
		for (int i : inputArr) 
		{
			System.out.print(i + " ");
		}
	}
	public void sort(int[] inputArr) 
	{
		this.array = inputArr;
		this.length = inputArr.length;
		this.tempMegreArr = new int[length];
		divideArray(0, length - 1);
	}
	public void divideArray(int lowerindex, int higherindex) 
	{
		if (lowerindex < higherindex) 
		{
			int middle = lowerindex + (higherindex - lowerindex) / 2;
        // it will sort the left side of the array
			divideArray(lowerindex, middle);
        // it will sort the right side of the array
			divideArray(middle + 1, higherindex);
			mergeArray(lowerindex, middle, higherindex);
		}
	}
	public void mergeArray(int lowerindex, int middle, int higherindex) 
	{
		for (int i = lowerindex; i <= higherindex; i++) 
		{
			tempMegreArr[i] = array[i];
		}
		int i = lowerindex;
		int j = middle + 1;
		int k = lowerindex;
		while (i <= middle && j <= higherindex)
		{
			if (tempMegreArr[i] <= tempMegreArr[j]) 
			{
				array[k] = tempMegreArr[i];
				i++;
			} else 
			{
				array[k] = tempMegreArr[j];
				j++;
			}
			k++;
		}
		while (i <= middle) 
		{
			array[k] = tempMegreArr[i];
			k++;
			i++;
		}
	}
}
