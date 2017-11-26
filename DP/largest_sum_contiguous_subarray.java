/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan =new Scanner(System.in);
		int n = scan.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++) a[i] = scan.nextInt();
		int ans = calculate(a);
		System.out.println(ans);
	}
	static int calculate(int a[]){
		int max2 = Integer.MIN_VALUE;
		int max =0, sum =0;
		for(int i=0;i<a.length;i++){
			if(sum +a[i]>=max){
				max = sum +a[i];
				sum+=a[i];
			}
			else if(sum + a[i]<0) sum =0;
			else sum+=a[i];
			if(a[i]>max2) max2 = a[i];
		}
		return max2<0?max2:max;
	}
}