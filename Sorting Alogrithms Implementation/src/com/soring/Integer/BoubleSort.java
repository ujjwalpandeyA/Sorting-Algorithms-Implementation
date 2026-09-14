package com.soring.Integer;

import java.util.Scanner;

public class BoubleSort {

	public static void sort(int[] arr) {
		int n = arr.length;

		for (int i = 1; i < n; i++) {
			for (int j = 0; j < n - 1; j++) {

				if (arr[j] > arr[j + 1]) {

					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
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
		System.out.println("Array Sorted by using Bouble Sort Technique");

		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}

	}
}
