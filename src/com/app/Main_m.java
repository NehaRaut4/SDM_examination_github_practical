package com.app;


public class Main_m {
	public static void main(String[] args) {
		
		    int[] arr = {100,14,46,47,94,94,52,86,36,94,89};
	        int n = 5;
	        int result = Array_ex.secondHighest(arr,n);
	        System.out.println(result);
	        System.out.println("Second Highest number is = "+result);
	        
//adding another array
	        
	        int arr1[] = {50,97,78,14,34};
	        int n1 = 3;
	        int result1 = Array_ex.secondHighest(arr1, n1);
	        System.out.println("Second Highest number in array1 is = "+result1);
	}

}
