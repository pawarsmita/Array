package array;

import java.util.Scanner;

public class arraydemo 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of arrya size");
		int size=sc.nextInt();
		int []a=new int[size];
		for (int i = 0; i < a.length; i++) 
		{
			System.out.println("Enter element ");
			a[i]=sc.nextInt();
			
		}
		for (int j = 0; j < a.length; j++) 
		{
			System.out.println(a[j]);
			
		}
				
		
	}

}
