
//Question2 :- Take 10 Integer inputs from user and store them in an Array. Again ask user to enter a number and now tell user to check whether that number is present in an Array or not..?

package Assignment;

import java.util.Scanner;

public class HwQuestn2 {

	public static void main(String[] args)
	{
		int flag=0;  
		Scanner obj=new Scanner(System.in);  
		System.out.print("Enter the number of elements you want to store: ");  
			int a =obj.nextInt();  
			int arr[] = new int[a]; 
			
			if(a>0)
			{
			System.out.println("Enter the elements of the array: ");  
			
			for(int i=0; i<a; i++)  
			{    
			  arr[i]=obj.nextInt();  
			}  
			  System.out.println("Array elements are: ");  
			  
			for (int i=0; i<a; i++)   
			{  
			  
				System.out.print(arr[i]+" ");  
				
			}  
			 
			System.out.println("\n"+"Enter the Number");
			  int num=obj.nextInt();
			  
		    for(int i=0;i<num;i++)
		    {
		        if(arr[i]==num)
		        {
		            System.out.println("Element "+num+" found in the array");
		            flag=1;
		            break;
		        }
		    }
		   if(flag==0)
		    {
		        System.out.println("Element "+num+" not found in the array");
		    }
			}  
		else {
			System.out.println("Invalid Entry");
		}
		}

	}
	
	
