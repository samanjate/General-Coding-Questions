public class MergeSortedArrays {

	private void mergeArrays(int[] a1, int[] a2, int n, int m) {

		int temp = -1;
		for(int j = m - 1; j >= 0; j--){
			temp = a2[j];
			a2[j] = a1[n - 1];
			a1[n - 1] = temp;
			for (int i = n - 1; i>0; i--) {
				if(a1[i] >= a1[i-1]) {
					break;
				} else {
					temp = a1[i-1];
					a1[i-1] = a1[i];
					a1[i] = temp;
				}
			}
		}

	}

	private void insertionSort(int[] a, int n) {
		int temp = -1;
		for(int i = 1; i < n; i++) {
			for(int j = n -1; j > i ; j--) {
				if(a[j]>a[i]) {
					continue;
				} else {
					temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {

		int[] a1 = {1,3,4,5,7,8,10};
		int[] a2 = {2,6,9,11,13};
		Practice p = new Practice();
		int n = a1.length;
		int m = a2.length;
		if(n >= m) {
			p.mergeArrays(a1,a2,n,m);
			p.insertionSort(a2,m);
		} else {
			p.mergeArrays(a2,a1,m,n);
			p.insertionSort(a1,n);
		}
		System.out.print("First array: ");

		for (int i = 0; i < a1.length; i++) {
			System.out.print(a1[i]+" ");
		}
		System.out.println();
		System.out.print("Second array: ");

		for (int i = 0; i < a2.length; i++) {
			System.out.print(a2[i]+" ");
		}
		System.out.println();
	}
}