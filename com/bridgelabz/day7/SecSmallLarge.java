package com.bridgelabz.day7;

import java.util.Scanner;

public class SecSmallLarge {
	

		static void SecSmallLarge() {
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the size");
			int n = sc.nextInt();
			int arr[] = new int[n];
			System.out.println("Enter the array elements");
			for(int i=0;i<arr.length;i++) {
				 arr[i] =sc.nextInt();
			}
					int small=arr[0];
		      
		      for(int i=0;i<arr.length;i++)
		      {
		             if(arr[i]<small)
		             {
		             small=arr[i];
		             }
		      }
		      
		        int sec_Small=arr[0];
		      
		     for(int i=0;i<arr.length;i++)
		      {
		             if(arr[i]<sec_Small && arr[i]!=small)
		             {
		             sec_Small=arr[i];
		             }
		       }
		      
		             System.out.println("Second Smallest Number: "+sec_Small);
		            System.out.println("");
		int large=arr[0];
	    
	    for(int i=0;i<arr.length;i++)
	    {
	           if(arr[i]>large)
	           {
	           large=arr[i];
	           }
	    }
	    
	      int sec_large=arr[0];
	    
	   for(int i=0;i<arr.length;i++)
	    {
	           if(arr[i]>sec_large && arr[i]!=large)
	           {
	           sec_large=arr[i];
	           }
	     }
	    
	           System.out.println("Second Large Number: "+sec_large);
	          
		
	}
		public static void main(String[] args) {
			
			SecSmallLarge.SecSmallLarge();
			
	  
		}

	}


