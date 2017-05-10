package algo.recursion;

public class App {

	public static void main(String[] args) {
		//System.out.println(recursiveBinarySearch(new int[] {1, 3, 4, 7, 13}, 0, 4, 17));
		System.out.println(recursiveLinearSearch(new int[] {1, 3, 4, 7, 13}, 0, 19));
	}
	
	public static void reduceByOne(int n){
		if (n >= 0) {
			reduceByOne(n-1);
		} 
		
		System.out.println("Completed call: " + n);
	}
	
	//recursive linear search
	public static int recursiveLinearSearch(int[] arr, int i, int x){
		
		if (i > arr.length - 1) {
			return -1;
		}else if (arr[i] == x) {
			return i;
		}else {
			System.out.println("index at: " + i);
			return recursiveLinearSearch(arr, i + 1, x);
		}
		
	}
	
	//recursive binary search
	public static int recursiveBinarySearch(int[] arr, int p, int r, int x){
		
		int q = (p + r) / 2;
		
		if (p > r) {
			return -1;
		}else if (arr[q] == x) {
			return q;
		}else if (arr[q] > x) {
			System.out.println("index at: " + q);
			return recursiveBinarySearch(arr, p, r-1, x);
		}else {
			System.out.println("index at: " + q);
			return recursiveBinarySearch(arr, q  +1, r, x);
		} 
	}
}
