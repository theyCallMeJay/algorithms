package algo.linearsearch;

public class LinearSearch {
	public String searchArray(int[] arr, int i){
		
		for (int j = 0; j < arr.length; j++) {
			if (arr[j] == i) {
				System.out.println("Foung element: " + arr[j] + " at position" + j);
				return "Search succesful";
			}
		} 
		return "Search failed!";
	}
}
