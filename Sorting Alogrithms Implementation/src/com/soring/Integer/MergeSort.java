package com.soring.Integer;

import java.util.Scanner;

public class MergeSort {
	public static void sort(int[] arr) {
		if (arr.length == 1)
			return;

		int[] left = new int[arr.length / 2];
		int[] right = new int[arr.length - left.length];

		int i = 0;
		while (i < left.length) {
			left[i] = arr[i];
			i++;
		}
		int j = 0;
		while (j < right.length) {
			right[j] = arr[i];
			i++;
			j++;
		}
		sort(left);
		sort(right);
		merge(left, right, arr);
	}

	public static void merge(int[] l, int[] r, int[] a) {
		int i = 0, j = 0, k = 0;

		while (i < l.length && j < r.length) {
			if (l[i] < r[j]) {
				a[k] = l[i];
				i++;
				k++;
			} else {
				a[k] = r[j];
				k++;
				j++;
			}
		}
		while (i < l.length) {
			a[k] = l[i];
			i++;
			k++;
		}
		while (j < r.length) {
			a[k] = r[j];
			k++;
			j++;
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
		System.out.println("Array Sorted by using Merge Sort Technique");

		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
