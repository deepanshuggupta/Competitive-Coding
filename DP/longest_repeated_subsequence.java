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
		String s1 = scan.next();
		int answer = LRS(s1);
		System.out.println(answer);
	}
	static int LRS(String s1){
		int m = s1.length();
		int preprocess[][] = new int[m+1][m+1];
		for(int i=0;i<=m;i++){
			for(int j =0;j<=m;j++){
				if(i==0 || j==0) preprocess[i][j]=0;
				else if( (i!=j) && (s1.charAt(i-1)==s1.charAt(j-1)) )
					preprocess[i][j] = preprocess[i-1][j-1]+1;
				else 
					preprocess[i][j] = maxm(preprocess[i-1][j],preprocess[i][j-1]);
			}
		}
		return preprocess[m][m];
	}
	static int maxm(int x, int y){
		return x>y?x:y;
		
	} 
}