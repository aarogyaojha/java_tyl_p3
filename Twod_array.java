//3. Take input of a 2-D array. Find the sum of all element present at column 1 and 2.

//Hint: Take input for N,M and an Array A[N][M]

//EX= Arr[4][3] = [[1,2,3], [10,20,30],[12,15,18],[5,15,25]]

//OUTPUT = 1+ 2 +10+20+12+15+5+15 = 80

package java_ty1_iat1;

import java.util.Scanner;

public class Twod_array {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sum=0;
		System.out.println("enter the number of rows and coloumns");
		int row=sc.nextInt();
		int col=sc.nextInt();
		int[][] matrix=new int[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				matrix[i][j]=sc.nextInt();
			}
		}
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < 2; j++) {
				sum=sum+matrix[i][j];
				System.out.println(sum);
			}
		}
		System.out.println(sum);

	}

}
