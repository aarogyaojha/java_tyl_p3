package java_ty1_iat1;

import java.util.Scanner;

public class vowels {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String line=sc.nextLine();
		String lower=line.toLowerCase();
		
		String line2="";
		for (int i = 0; i < line.length(); i++) {
			if(lower.charAt(i)!='a' && lower.charAt(i)!='e'  && lower.charAt(i)!='i' && lower.charAt(i)!='o' && lower.charAt(i)!='u'  ) {
				line2=line2+line.charAt(i);
			}
		}
		System.out.println(line2);
	}
}
