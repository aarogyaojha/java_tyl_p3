//Given a list of integers, write a function to find the second largest number without using in built
//functions.

//Arr1= [10,20,30,40,32,76,32,99] OUTPUT = 76

package java_ty1_iat1;

import java.util.Scanner;
import java.util.Arrays;

public class second_largest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n=sc.nextInt();
		int[] arr=new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.println(arr[n-2]);
	}

}
