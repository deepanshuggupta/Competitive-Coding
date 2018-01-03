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
		String s = "deepu";
		calculate(s);
	}
	static void calculate(String s){
		int count[] = new int[256];
		int max_index = -1;
		int max = -1;
		for(int i=0;i<s.length();i++){
			count[s.charAt(i)]+=1;
			if(count[s.charAt(i)]>max){
				max_index = s.charAt(i);
				max = count[s.charAt(i)];
			} 
		}
		System.out.println("value is: " + (char)max_index);
	}
}