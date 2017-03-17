# DataStructures
Data Structures and Algorithms from around the World

# INDEX

## Sorting Algorithms
1. Insertion Sort

# CODE (FUNCTIONS)
1. Insertion Sort
```java
public static void insertionSort(int[] arr, int n) {
		for (int j = 2; j <= n; j++) {
			int key = arr[j]; //temporarily storing the target element since it can be relocated further 
			int i = j - 1;
			while (i > 0 && arr[i] > key) {
				//running a loop, to find the correct position of the element 
				arr[i + 1] = arr[i];
				i = i - 1;
			}
			arr[i + 1] = key;
		}
	}
```
