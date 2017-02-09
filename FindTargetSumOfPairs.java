// Finds the given target sum of pairs in n array in O(n^2) time

import java.util.ArrayList;

public class FindTargetSumOfPairs {

	public void findPairs(int arr[], int target) {
		ArrayList<Integer> temp = new ArrayList<Integer>();
		for(int i=0; i < arr.length; i++) {
			for(int j=0; j < arr.length; j++) {
				if(arr[i]+arr[j] == target && !temp.contains(j)) {
					temp.add(i);
					temp.add(j);
					System.out.println(arr[i] + " + " + arr[j]);
				}
			}
		}
	}

	public static void main(String[] args) {
		Practice p = new Practice();
		int[] a = {3,5,7,6,2,0,9,1,4};
		int t = 5;
		p.findPairs(a, t);
	}
}