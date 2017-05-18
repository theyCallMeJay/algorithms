package algo.mergesort;

public class MergeSort {
	
	public static void sort(int[] inputArray){
		sort(inputArray, 0, inputArray.length-1);
	}

	private static void sort(int[] inputArray, int start, int end) {
		// TODO Auto-generated method stub
		if (start >= end) {
			return;	
		}
		
		int mid = (start + end) / 2;
		sort(inputArray, start, mid);
		sort(inputArray, mid + 1, end);
		merge(inputArray, start, mid, end);
	}

	private static void merge(int[] inputArray, int start, int mid, int end) {
/*		// TODO Auto-generated method stub
		int[] left = new int[mid + 1];
		int[] right = new int[end - mid];
		System.arraycopy(inputArray, 0, left, 0, mid + 1);
		System.arraycopy(inputArray, mid + 1, right, 0, end - mid);
		int k = 0;
		
		while () {
			
		}
		for (int i = 0; i < right.length; i++) {
			for (int j = 0; j < left.length; j++) {
				if (left[i] > right[j]) {
					inputArray[k] = right[j];
					j++;
					k++;
				}else {
					inputArray[k] = left[i];
					i++;
					k++;
				}
			}
		}
		*/
		int[] temp = new int[end - start + 1];
		int leftSort = start;
		int rightSort = mid + 1;
		int k = 0;
		
		while (leftSort <= mid && rightSort <= end) {
			if (inputArray[leftSort] > inputArray[rightSort]) {
				temp[k] = inputArray[rightSort];
				rightSort ++;
			}else {
				temp[k] = inputArray[leftSort];
				leftSort ++;
			}
			
			k ++;
		}
		
		if (leftSort <= mid) {
			while (leftSort <= mid) {
				temp[k] = inputArray[leftSort];
				leftSort ++;
				k++;
			}
		}else if (rightSort <= end) {
			while (rightSort <= end) {
				temp[k] = inputArray[rightSort];
				rightSort ++;
				k++;
			}
		}
		
		for (int i = 0; i < temp.length; i++) {
			inputArray[start + i] = temp[i];
		}
		
	}
}
