package com.app;

public class Array_ex {

	public static int secondHighest(int arr[],int n) {
	    int temp;
	    for(int i=0;i<n;i++) {
	        for(int j=i+1;j<n;j++) {
	            if(arr[i] > arr[j]) {
	                temp = arr[i];
	                arr[i] = arr[j];
	                arr[j] = temp;
	            }
	        }
	    }
	    return arr[n-2];
	}
}
