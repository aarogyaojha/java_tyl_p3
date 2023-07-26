//Take input of a sentence and PRINT the Length of Middle word in the sentence and if they are two
//middle elements than print the one which has maximum length.

//EX: WELCOME TO CODECHEF EVENT;
//OUTPUT: 8


package java_ty1_iat1;

import java.util.Scanner;

public class middle_element {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String line=sc.nextLine();
		
		String[] words=line.split("\\s+");
		String[] middlewords;
		int middleindex=words.length/2;
		if(words.length%2==0) {
			middlewords = new String[]{words[middleindex - 1], words[middleindex]};
		}
		else {
			middlewords=new String[] {words[middleindex]};
		}
		
		String maxword=middlewords[0];
		for (int i = 0; i < middlewords.length; i++) {
			String word=middlewords[i];
			if(word.length()>maxword.length()) {
				maxword=word;
			}
		}
		
		System.out.println("length :"+maxword.length());
		
	}

}
