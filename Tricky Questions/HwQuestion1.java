//Question1 :- Take 10 integer inputs from user and store them in an array and print them on screen..?


package Assignment;

import java.util.Scanner;

public class HwQuestn1 {

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
			System.out.println("Array elements are");
			for(int i=0;i<num;i++) 
			{
				System.out.println(arr[i] + "\t");
			}
		}
		else {
			System.out.println("Invalid Entry");
		}

	}

}

