//Question4 :- Take 10 integer inputs from user and store them in an array. Now, copy all the elements in an another array but in Reverse order..? 


package Assignment;

import java.util.Scanner;

public class HwQuestn4 {

	public static void main(String[] args)
	{
		Scanner obj = new Scanner(System.in);
		int arr1[]=new int[10];
		System.out.println("Enter the Elements of the array");
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i]=obj.nextInt();
		}
		
		System.out.println("Array Elements are :");
		for(int i=0;i<arr1.length;i++)
		{
			System.out.print(arr1[i]+ "\t");
		}
		
		System.out.println(" ");
		
		int arr2[]=new int[10];
		int rev=0;
		
		System.out.println("New array in reversed order is :");
		int a[]=new int [arr1.length];
		for(int i=arr2.length-1;i>=0;i--) 
		{
			System.out.print(arr1[i]+ "\t");
		}
		
	}
	
	}
