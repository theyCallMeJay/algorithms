package algo.mergesort;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class App {
	public static void main(String[] args){
		int[] inputArray = {3, 45, 5, 1, 34, 21, 10};
		MergeSort.sort(inputArray);
		
		for (int i : inputArray) {
			System.out.println(i);
		}
	}
}
