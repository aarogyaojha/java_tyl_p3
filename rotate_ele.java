package java_ty1_iat1;

import java.util.Scanner;

public class rotate_ele {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n=sc.nextInt();
		int[] arr1=new int[n];
		int[] arr2=new int[n];
		
		System.out.println("enter the elements");
		for (int i = 0; i < arr1.length; i++) {
			arr1[i]=sc.nextInt();
		}
		
		int temp=arr1[n-1];
		
		for (int i = 0; i < arr2.length-1; i++) {
			arr2[i+1]=arr1[i];
		}
		arr2[0]=temp;
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr2[i]);
		}
	}

}
