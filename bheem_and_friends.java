//Bheem has N friends. And he has a ladoo for each day. Given an Array A[] denoting on which day 

//friend wants a ladoo. If Bheem is unable to give a ladoo to a friend, he loses his friendship with them.
//Find out the maximum number of Friends he can have at the end.

//N = 5 A[] = {3, 3, 1, 2, 4}

//Output: 4 {As he is unable to give a ladoo to friend 5}

package java_ty1_iat1;

import java.util.Arrays;
import java.util.Scanner;

public class bheem_and_friends {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of friends");
        int num = sc.nextInt();
        sc.nextLine(); // Clear the input buffer

        int[] arr = new int[num];
        System.out.println("Enter days when each friend wants a ladoo");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        
        Arrays.sort(arr);
        int uniqueElements = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                arr[uniqueElements] = arr[i];
                uniqueElements++;
            }
        }

//        int[] uniqueArr = Arrays.copyOf(arr, uniqueElements);
        int count=0;
        for (int i = 0; i <uniqueElements; i++) {
        	count=count+1;
		}
        System.out.println(count);
    }
}
