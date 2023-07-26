//Given Two Array where First Array have some elements and second array consist of indices, Find the
//sum of all element from Array1, and subtract all the indices value present in array2.

//EX: Arr1 = [10,20,30,40,50] Arr2 = [0,2]
//OUTPUT SUM = 10+20+30+40+50 - (10+30) = 110

package java_ty1_iat1;

import java.util.Scanner;

public class sum_of_ele {

	public static void main(String[] args) {
		int s1=0,d1=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of elements for first array");
		int n1=sc.nextInt();
		int[] arr1=new int[n1];
		for (int i = 0; i < arr1.length; i++) {
			arr1[i]=sc.nextInt();
		}
		System.out.println("enter the number of elements for second array");
		int n2=sc.nextInt();
		int[] arr2=new int[n2];
		for (int i = 0; i < arr2.length; i++) {
			arr2[i]=sc.nextInt();
		}
		for (int i = 0; i < n1; i++) {
			s1=s1+arr1[i];
		}
		for (int j = 0; j < arr2.length; j++) {
			int k=arr2[j];
			int ele=arr1[k];
			d1=Math.abs(d1+ele);
		}
		System.out.println(s1-d1);
		
	}

}
