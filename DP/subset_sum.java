/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int a[] = {3, 34, 4, 12, 5, 2};
		int key =9;
		System.out.println(calculate(a, key));
		
	}
	static boolean calculate(int a[], int key){
		int n = a.length;
		Arrays.sort(a);
		int sum[][] = new int[n][n];
		for(int i=0;i<n;i++){
			sum[i][i] = a[i];
			for(int j=i+1;j<n;j++){
				sum[i][j] = sum[i][j-1] + a[j];
				if(sum[i][j] == key) return true;
			}
		}
		return false;
	}
}