package easy;

// import java.io.*;
import java.util.*;
// import java.text.*;
// import java.math.*;
// import java.util.regex.*;

/*
 * Given a string, , and two indices,  and , print a substring consisting of all characters in the inclusive range from  to . You'll find the String class' substring method helpful in completing this challenge.

Input Format

The first line contains a single string denoting .
The second line contains two space-separated integers denoting the respective values of  and .

Constraints

String  consists of English alphabetic letters (i.e., ) only.
Output Format

Print the substring in the inclusive range from  to .

Sample Input

Helloworld
3 7
Sample Output

lowo
Explanation

 */

public class Substring {

    // public class Solution {

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

            System.out.print("S: ");
            String S = in.next();
            System.out.print("start: ");
            int start = in.nextInt();
            System.out.print("end: ");
            int end = in.nextInt();
            in.close();

            System.out.println(S.substring(start, end));
        }
    // }

}
