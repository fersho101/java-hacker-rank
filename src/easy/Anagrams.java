package easy;

import java.util.Arrays;
import java.util.Scanner;

/*
 * wo strings,  and , are called anagrams if they contain all the same characters in the same frequencies. For this challenge, the test is not case-sensitive. For example, the anagrams of CAT are CAT, ACT, tac, TCA, aTC, and CtA.

Function Description

Complete the isAnagram function in the editor.

isAnagram has the following parameters:

string a: the first string
string b: the second string
Returns

boolean: If  and  are case-insensitive anagrams, return true. Otherwise, return false.
Input Format

The first line contains a string .
The second line contains a string .

Constraints

Strings  and  consist of English alphabetic characters.
The comparison should NOT be case sensitive.
 */
public class Anagrams {

    public static boolean isAnagram(String a, String b) {

        String[] aArr = a.split("");
        String[] bArr = b.split("");

        aArr = sortStringArray(a);
        bArr = sortStringArray(b);

        for (int i = 0; i < bArr.length; i++) {
            String letterA = aArr[i];
            String letterB = bArr[i];
            if (!(letterA.equals(letterB))) {
                return false;
            }
        }
        return true;
    }

    public static String[] sortStringArray(String str) {
        String[] strArr = new String[str.length()];
        strArr = str.split("");
        Arrays.sort(strArr);
        return strArr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite str a: ");
        String a = sc.next().toLowerCase();
        System.out.println("Digite string b: ");
        String b = sc.next().toLowerCase();
        sc.close();
        isAnagram(a, b);

        boolean ret = isAnagram(a, b);
        System.out.println(ret ? "Anagrams" : "Not Anagrams");
    }
}
