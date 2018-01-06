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
		String str = "ab4c12ed3";
        int k = 21;
        decrypt(str, k);
	}
	static void decrypt(String s, int k){
		String dec = "";
		for(int i=0;i<s.length();){
			String temp ="";
			int count =0;
			while(i<s.length() && s.charAt(i)>='a' && s.charAt(i) <= 'z'){
				temp+=s.charAt(i);
				i++;
			}
			while(i<s.length() && s.charAt(i)>='0' && s.charAt(i) <= '9'){
				count = count*10 + (int)(s.charAt(i)-'0');
				i++;
			}
			for(int j=1;j<=count;j++){
				dec+=temp;
			}
		}
		System.out.println(dec.charAt(k-1));
	}
}