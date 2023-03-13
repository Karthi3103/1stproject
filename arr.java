package test;

import java.util.Scanner;

public class arr {
     static int b;
	public static void main(String[] args) {
		
		Scanner sn = new Scanner(System.in);
		System.out.println("Enter the no of array");
		int n=sn.nextInt();
		int a[] = new int[n];
		
		System.out.println("Enter the Number");
		for(int i=0;i<n;i++)
		{
			a[i]=sn.nextInt();
		}
		
		System.out.println("Length="+a.length);
		for(int i=0;i<n;i++)
		{ 
			
			 b+=a[i];
			
		}
		System.out.println(b);
	}

}
