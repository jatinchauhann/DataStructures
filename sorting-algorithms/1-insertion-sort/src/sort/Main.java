package sort;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Enter the number of elements");
		int n = in.nextInt();
		int[] arr = new int[n+1];
		System.out.println("Enter the elements");
		for (int i = 1; i <= n; i++)
			arr[i] = in.nextInt();
		System.out.println("Entered elements:");
		display(arr, n);
		insertionSort(arr, n);
		System.out.println("\nElements after sorting");
		display(arr, n);
	}

	public static void insertionSort(int[] arr, int n) {
		for (int j = 2; j <= n; j++) {
			int key = arr[j];
			int i = j - 1;
			while (i > 0 && arr[i] > key) {
				arr[i + 1] = arr[i];
				i = i - 1;
			}
			arr[i + 1] = key;
		}
	}

	public static void display(int[] arr, int n) {
		for (int i = 1; i <= n; i++)
			System.out.print(arr[i] + " ");
	}

}
