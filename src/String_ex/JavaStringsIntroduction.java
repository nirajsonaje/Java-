package String_ex;

import java.util.Scanner;

public class JavaStringsIntroduction {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();
		System.out.println(A.length() + B.length());
		int l = A.length() > B.length() ? B.length() : A.length();
		String str = "";
		for (int i = 0; i < l; i++) {
			if ((int) (A.toLowerCase()).charAt(i) > (int) (B.toLowerCase()).charAt(i)) {
				str = "Yes";
				break;
			} else if ((A.toLowerCase()).charAt(i) < (B.toLowerCase()).charAt(i)) {
				str = "No";
				break;
			}
		}
		if (str == "") {
			if (A.length() > B.length()) {
				str = "Yes";
			} else {
				str = "No";
			}
		}
		System.out.println(str);

		System.out.println((A.toUpperCase()).charAt(0) + A.substring(1, A.length()) + " " + (B.toUpperCase()).charAt(0)
				+ B.substring(1, B.length()));
		sc.close();
	}

}
/*Given two strings of lowercase English letters,  and , perform the following operations:

Sum the lengths of  and .
Determine if  is lexicographically larger than  (i.e.: does  come before  in the dictionary?).
Capitalize the first letter in  and  and print them on a single line, separated by a space.
Input Format

The first line contains a string . The second line contains another string . The strings are comprised of only lowercase English letters.

Output Format

There are three lines of output:
For the first line, sum the lengths of  and .
For the second line, write Yes if  is lexicographically greater than  otherwise print No instead.
For the third line, capitalize the first letter in both  and  and print them on a single line, separated by a space.*/
