//Given an array A of size N of integers. Your task is to find the sum of minimum and maximum
//element in the array.
//
//A [] = {-2, 1, -4, 5, 3} N=5
//OUTPUT = -4+5=1
//
//A [] = {1, 3, 4, 1} N=4
//OUTPUT = 1+4 = 5

package java_ty1_iat1;

import java.util.Arrays;
import java.util.Scanner;

public class min_and_max {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("enter the elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		
		Arrays.sort(arr);
		System.out.println(arr[0]+arr[n-1]);

	}
}
