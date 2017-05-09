package algo.recursion;

public class App {

	public static void main(String[] args) {
		System.out.println(recursiveLinearSearch(new int[] {1, 2, 3, 4 ,5}, 0, 5));
	}
	
	public static void reduceByOne(int n){
		if (n >= 0) {
			reduceByOne(n-1);
		} 
		
		System.out.println("Completed call: " + n);
	}
	
	public static int recursiveLinearSearch(int[] arr, int i, int x){
		if (i > arr.length) {
			return -1;
		}else if (arr[i] == x) {
			return i;
		}else {
			System.out.println("index at: " + i);
			return recursiveLinearSearch(arr, i + 1, x);
		}
		
	}
}
