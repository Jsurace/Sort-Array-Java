/*
Filename:	SortArray.java
Author:	Jenna
Date:	2/21/19
*/

import java.util.*;
import java.util.Arrays;

public class SortArray
{
	public static void main(String[] args)
	{

	int temp, num;
	String numString;
	int[] numArray = {22, 100, 9, 35, 40, 2, 88, 17, 55, 60};

	for (int y = 0; y < numArray.length; y++) {
	    for (int x = y; x < numArray.length; x++) {
	        if (numArray[y] < numArray[x]) {
	            temp = numArray[y];
	            numArray[y] = numArray[x];
	            numArray[x] = temp;
	        }
	    }
	}

	numString = Arrays.toString(numArray);

	System.out.println(numString);
	}
}
