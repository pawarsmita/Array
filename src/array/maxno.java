package array;

import java.util.Scanner;



public class maxno 
{
	public static void main(String[] args) 
	{
		int n,g;
		Scanner sc=new Scanner(System.in);
				System.out.println("Enter size of array");
				n=sc.nextInt();
				
				int a[]=new int [n];
				for(int i=0;i<n;i++)
				{
					System.out.println("Enter the value");
					a[i]=sc.nextInt();
				}
				
		      g=a[0];
		      for(int j=0;j<n;j++)
		      {
		    	  if(a[j]>g)
		    	  {
		    		  g=a[j];
		    	  }
		      }
		      
		System.out.println(g);
	}

}
