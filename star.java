/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n,sum=0,i;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		String f=String.valueOf(n);
		char a[]=f.toCharArray();
		for(i=0;i<a.length;i++)
		{
			int d=Character.getNumericValue(a[i]);
			sum=sum+d;
		}
		System.out.print(sum);// your code goes here
	}
}
