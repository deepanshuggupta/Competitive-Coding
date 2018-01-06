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
		String ch = "abcbaa";
        int k = 3;
        callMe(ch,k);
        
	}
	static void callMe(String str, int k){
		int res = 0;
 
        int n = str.length();
 
        // To store count of characters from 'a' to 'z'
        int cnt[] = new int[26];
 
        // Consider all substrings beginning with
        // str[i]
        for (int i = 0; i < n; i++)
        {
            int dist_count = 0;
 
            // Initializing count array with 0
            Arrays.fill(cnt, 0);
 
            // Consider all substrings between str[i..j]
            for (int j=i; j<n; j++)
            {
                // If this is a new character for this
                // substring, increment dist_count.
                if (cnt[str.charAt(j) - 'a'] == 0)
                    dist_count++;
 
                // Increment count of current character
                cnt[str.charAt(j) - 'a']++;
 
                // If distinct character count becomes k,
                // then increment result.
                if (dist_count == k)
                    res++;
            }
        }
 
        System.out.println(res);
	}
}