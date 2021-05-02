package JavaBasics;

public class Arrays {
	// Container which stores multiple values of same data type
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * int a[] = new int[5];//Declare array & allocates memory // Array
		 * literal int[b] ={1,2,3,4,5} a[0]=1; a[1]=5; a[2]=6; a[3]=0; a[4]=9;
		 * 
		 * for(int i=0;i<a.length;i++){
		 * 
		 * System.out.println(a[i]); }
		 */

		// Multi dimensional array

		int b[][] = new int[2][2];

		b[0][0] = 1;
		b[0][1] = 2;
		b[1][0] = 3;
		b[1][1] = 4;

		for (int i = 0; i < 2; i++) { // row

			for (int j = 0; j < 2; j++) { // col

				System.out.println(b[i][j]);
			}
		}

	}

}
