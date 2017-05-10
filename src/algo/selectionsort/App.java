package algo.selectionsort;

public class App {

	public static void main(String[] args) {
		int[] newArray = selectionSort(new int[] {5, 2, 25, 13, 8, 9, 4});
		/*for (int i = 0; i < newArray.length; i++) {
			System.out.println(newArray[i]);
		}*/
		
		for (int i : newArray) {
			System.out.println(i);
		}

	}

	public static int[] selectionSort(int[] arr){
		for (int i = 0; i < arr.length; i++) {
			int minimum = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[minimum] > arr [j]) {
					minimum = j;
				}
			}
			
			int temp = arr[i];
			arr[i] = arr[minimum];
			arr[minimum] = temp;
		}
		return arr;
	}
}
