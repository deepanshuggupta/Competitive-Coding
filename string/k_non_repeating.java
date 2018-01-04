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
		String s = "geeksforgeeks";
		int k =4;
		frequent(s,k);
	}
	static void frequent(String s, int k){
		HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
		int max = Integer.MIN_VALUE;
		char max_c = s.charAt(0);
		for(int i=0;i<s.length();i++){
			char c = s.charAt(i); 
			if(hm.containsKey(c)){
				int count = hm.get(c);
				count++;
				hm.put(c,count);
				if(count>max){
					max = count;
					max_c =c;
				}
			}
			else hm.put(c, 1);
		}
		int no = k;
		for(int i =0;i<s.length();i++){
			if(hm.get(s.charAt(i)) == 1){
				k--;
				if(k==0){
					System.out.println("value is: " + s.charAt(i));
					break;
				}
			}
		}
		if( k!=0) System.out.println("not found");
		
	}
}