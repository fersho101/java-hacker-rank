package easy;

import java.util.Scanner;

/*
 * A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.

Given a string , print Yes if it is a palindrome, print No otherwise.

Constraints

 will consist at most  lower case english letters.
Sample Input

madam
Sample Output

Yes
 */

public class StringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        sc.close();

        String[] strArr = str.split("");

        String test = "";

        for (int i = strArr.length - 1; i >= 0; i--) {
            test += strArr[i];
        }

        System.out.println(test.equalsIgnoreCase(str) ? "Yes" : "No");

        // System.out.println(test);
    }

}
