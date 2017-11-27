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
		Scanner scan = new Scanner(System.in);
		String text = scan.nextLine();
		String pattern = scan.next();
		int index = naive(text, pattern);
		System.out.println(index);
	}
	static int naive(String text, String pattern){
		int n = text.length();
		int m = pattern.length();
		boolean found= true;
		for(int i=0;i<=n-m;i++){
			for(int j=0;j<m;j++){
				if(text.charAt(i+j)!= pattern.charAt(j)) found = false;
			}
			if(found) return i;
			found = true;
		}
		return -1;
	}
}