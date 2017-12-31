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
		int arr[] = {2, 4, 5, 6};
		find(arr);
		
	}
	static void find(int a[]){
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++){
			if(a[i]>max) max = a[i];
			if(a[i]<=min) min = a[i];
		}
		int visited[] = new int[max-min+1];
		Arrays.fill(visited,0);
		for(int i=0;i<a.length;i++){
			visited[a[i]-min] =1;
		}
		int i=0,flag=1;
		for(i=0;i<visited.length;i++){
			if(visited[i]==0){
				flag=0;
				System.out.println("No");
				break;
			}
		}
		if(flag==1) System.out.println("Yes");
	}
}