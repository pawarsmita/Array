package array;

import java.util.Scanner;

public class Average

{
	public static void main(String[] args) 
	{
		int n, sum=0;
		float  Average;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the array Elements");
		n=s.nextInt();
		int a[]=new int [n];
		System.out.println("Enter the all Element ");
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
	    	 sum=sum+a[i];
		}
		System.out.println(sum);
		Average=(float)sum/n;
		System.out.println(Average);
		
		
	}

}
