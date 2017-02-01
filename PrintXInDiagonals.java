// Prints X at the diagonals of a 2D matrix, given the dimensions of the matrix N x N
// where N is always odd

// e.g.Enter an odd Integer: 21
/*

X 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 X 
0 X 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 X 0 
0 0 X 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 X 0 0 
0 0 0 X 0 0 0 0 0 0 0 0 0 0 0 0 0 X 0 0 0 
0 0 0 0 X 0 0 0 0 0 0 0 0 0 0 0 X 0 0 0 0 
0 0 0 0 0 X 0 0 0 0 0 0 0 0 0 X 0 0 0 0 0 
0 0 0 0 0 0 X 0 0 0 0 0 0 0 X 0 0 0 0 0 0 
0 0 0 0 0 0 0 X 0 0 0 0 0 X 0 0 0 0 0 0 0 
0 0 0 0 0 0 0 0 X 0 0 0 X 0 0 0 0 0 0 0 0 
0 0 0 0 0 0 0 0 0 X 0 X 0 0 0 0 0 0 0 0 0 
0 0 0 0 0 0 0 0 0 0 X 0 0 0 0 0 0 0 0 0 0 
0 0 0 0 0 0 0 0 0 X 0 X 0 0 0 0 0 0 0 0 0 
0 0 0 0 0 0 0 0 X 0 0 0 X 0 0 0 0 0 0 0 0 
0 0 0 0 0 0 0 X 0 0 0 0 0 X 0 0 0 0 0 0 0 
0 0 0 0 0 0 X 0 0 0 0 0 0 0 X 0 0 0 0 0 0 
0 0 0 0 0 X 0 0 0 0 0 0 0 0 0 X 0 0 0 0 0 
0 0 0 0 X 0 0 0 0 0 0 0 0 0 0 0 X 0 0 0 0 
0 0 0 X 0 0 0 0 0 0 0 0 0 0 0 0 0 X 0 0 0 
0 0 X 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 X 0 0 
0 X 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 X 0 
X 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 X 

*/

public class PrintXInDiagonals {

	public static void main(String[] args) {

		System.out.print("Enter an odd Integer: ");
		int N = Integer.parseInt(System.console().readLine());
		System.out.println();

		String[][] arr = new String[N][N];

		for (int j=0; j< N ; j++) {
			for (int i=0; i<N; i++) {
				if (i == j || i == N-j-1) {
					arr[i][j] = "X";
				}
				else {
					arr[i][j] = "0";
				}
			}
		}

		for (int j=0; j< N ; j++) {
			for (int i=0; i<N; i++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}