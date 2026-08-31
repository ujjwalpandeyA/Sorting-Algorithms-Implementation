package com.soring.Integer;

import java.util.Scanner;

public class SelectionSort {
	public static void sort(int[] a) {
		
		int n=a.length;
		
		for(int i=0; i<n-1; i++) {
			int minIdx=i;
			for(int j=i+1; j<n; j++) {
				if(a[j]<a[minIdx]) {
					minIdx=j;
				}
			}
			int temp=a[i];
			a[i]=a[minIdx];
			a[minIdx]=temp;
		}	
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of elements : ");
		int n = sc.nextInt();
		int[] arr = new int[n];

		System.out.println("Enter the elements : ");

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		sort(arr);
		System.out.println("Array Sorted by unsing Selection Sort Technique");

		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
