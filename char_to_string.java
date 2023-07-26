//Take input for a number N and then input of a char array whose length is N, convert it into a String
//such that no two consecutive same letters occur together
//
//arr = ['H','E','L','L','L','O'] N=6
//OUTPUT:HELO

package java_ty1_iat1;

import java.util.Scanner;

public class char_to_string {

	public static void main(String[] args) {
		String sum="";
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of characters");
		int n=sc.nextInt();
		char[] ch=new char[n];
		char[] new_ch=new char[10];
		int index=0;
		for (int i = 0; i < ch.length; i++) {
			ch[i]=sc.next().charAt(0);
		}
		
//		concatinating the characters
		for (int i = 0; i < ch.length; i++) {
			sum=sum+ch[i];
		}
		System.out.println(sum);
		
		String temp=""+sum.charAt(0);
		
		for (int i = 0; i < sum.length(); i++) {
			if(!temp.contains(String.valueOf(sum.charAt(i)))) {
				temp=temp+sum.charAt(i);
			}
		}
		System.out.println(temp);
	}

}
