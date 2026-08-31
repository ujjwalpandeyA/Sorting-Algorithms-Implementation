package com.soring.Integer;

import java.util.Scanner;

public class QuickSort {
	public static void sort(int[] a, int low, int high) {
		if(low>=high) return ;
		
		int pivot=a[low+(high-low)/2];
		int l=low;
		int h=high;
		
		while(l<=h) {
			while(a[l]<pivot) l++;
			while(a[h]>pivot) h--;
			
			if(l<=h) {
				int temp= a[l];
				a[l]=a[h];
				a[h]=temp;
				l++;
				h--;
			}
		}
		sort(a, low, h);
		sort(a, l, high);
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
		sort(arr, 0, arr.length-1);
		System.out.println("Array Sorted by unsing Quick Sort Technique");

		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
