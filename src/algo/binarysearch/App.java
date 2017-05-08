package algo.binarysearch;

public class App {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8};
		System.out.println(binarySearch(arr, 3));
	}
	
	public static int binarySearch(int[] arr, int x){
		int p = 0;
		int r = arr.length;
		int q;
		while (p <= r) {
			q = (p + r) /2;
			if (x > arr[q]) {
				p = q + 1;
			}else if (x < arr[q]){
				r = q - 1;
			}else {
				return arr[q];
			}
		}
		
		return -1;
	}

}
