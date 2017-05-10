package algo.insertionsort;

public class App {

	public static void main(String[] args) {
		int[] is = insertionsort(new int[] {3, 5 ,10, 1, 29, 17, 14, 13, 12});
		for (int i : is) {
			System.out.println(i);
		}
	}
	
	public static int[] insertionsort(int[] arr){
		for (int i = 1; i < arr.length; i++) {
			int insertedElement = arr[i];
			int j = i - 1;
				while (j >= 0 && arr[j] > insertedElement) {
					arr[j + 1] = arr[j];
					j --;
				}
				
			arr[j+1] = insertedElement;
		}
		return arr;
	}
}
