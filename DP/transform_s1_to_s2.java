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
		String s1 = "deepu";
		String s2 = "deepugupta";
		int m = s1.length();
		int n = s2.length();
		int a[][] = new int[m+1][n+1];
		for(int i=0;i<=m;i++){
			for(int j=0;j<=n;j++){
				if(i==0) a[i][j] = j;
				else if(j==0) a[i][j] = 0;
				else if(s1.charAt(i-1)== s2.charAt(j-1)) a[i][j] = a[i-1][j-1];
				else a[i][j] = 1+ min(a[i-1][j], a[i][j-1], a[i-1][j-1]);
			}
		}
		System.out.println(a[m][n]);
	}
	
	static int min(int x, int y, int z){
		if(x<=y && x<=z) return x;
		if(y<=x && y<=z) return y;
		return z;
	}
}