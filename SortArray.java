/*
Filename:	SortArray.java
Author:	Jenna
Date:	2/18/19
*/

import java.util.*;

public class SortArray
{
	public static void main(String[] args)
	{
		int[] numArray = {22, 100, 9, 35, 40, 2, 88, 17, 55, 60};
		int x, y, temp;
		x = 1;

		System.out.println("Array is as follows before sorting: " + numArray);
/*
		while(x < numArray.length)
		{
			temp = numArray[x];
			y = x - 1;
			while(y >= 0 && numArray[y] > temp)
			{
				numArray[y + 1] = numArray[y];
				--y;
			}
			numArray[y + 1] = temp;
			++x;
		} */
		System.out.println("Sorting Complete: " + numArray[x]);
	}
}

