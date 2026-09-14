package com.soring.Integer;

import java.util.Scanner;

public class InsertionSort {
	
	public static void sort(int[] a) {
		
		for(int i=1; i<a.length; i++) {
			int key=a[i];
			int j=i-1;
			while(j>=0 && a[j]>key) {
				a[j+1]=a[j];
				j=j-1;
			}
			a[j+1]=key;
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
		sc.close();
		sort(arr);
		System.out.println("Array Sorted by using Insertion Sort Technique");

		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
