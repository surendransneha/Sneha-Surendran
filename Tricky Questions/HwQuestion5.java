//Question5 :- Write a program to check if elements of an Array are same or not, when it reads from front and back.


package Assignment;

import java.util.Scanner;

public class HwQuestn5 {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the number of Elements in  the array");
		int num =obj.nextInt();
		
		if(num>0 ) {
			
			int arr[]=new int[num];
			
			System.out.println("Enter the Elements ");
			
			for(int i=0;i<num;i++) 
			{
				arr[i]= obj.nextInt();
			}
			
			boolean b = false;
			int j =arr.length-1;
			
			System.out.println("Elements of given Array are");
			System.out.println();
			
			for(int i=0;i<arr.length;i++)
			{
				int a = arr[i];
				System.out.print(a+"\t");
			}
			
			for(int i=0; i<arr.length/2; i++)
			{
				if(arr[i] != arr[j])
				{
					b = false;
				}
				else
					b=true;
				j--;
			}
			
			System.out.println();
			if(b)
			{
				System.out.println("The Given Array Elements are same from front and Back");
			}
			else 
			{
				System.out.println("The Given Array Elements are not same from front and Back");
			}
		}
		
		else {
			System.out.println("Invalid Entry");
		}
		
	}
	}
