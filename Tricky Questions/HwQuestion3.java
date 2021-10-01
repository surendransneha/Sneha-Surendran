
//Question3 :- Take 20 integer inputs from user and Store them in an Array and print the following :
               *Number of Positive Numbers
               *Number of Negative Numbers
               *Number of Even Numbers
	             *Number of Odd Numbers	
	             *Number of Zero's



package Assignment;

import java.util.Scanner;

public class HwQuestn3 {

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
		
			System.out.println();
			int even = 0;
			int odd = 0;
			int positive = 0;
			int negative = 0;
			int zero = 0;
		
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i] > 0)
				{
					positive++;
				}
				else if(arr[i] < 0)
				{
					negative++;
				}
				else if(arr[i] == 0)
				{
					zero++;
				}
			}
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i] % 2 == 0 )
				{
					even++;
				}
				else if(arr[i] % 2 != 0 )
				{
					odd++;
				}
			}
			System.out.println();
			
			System.out.println("Total number of Positive Numbers present in an Array :"+positive);
			System.out.println("Total number of Negative Numbers present in an Array :"+negative);
			System.out.println("Total number of Even Numbers present in an Array :"+even);
			System.out.println("Total number of Odd Numbers present in an Array :"+odd);
			System.out.println("Total number of Zero's present in an Array :"+zero);
		}
		else
		{
			System.out.println("Invalid Entry");
		}

	}

	}
