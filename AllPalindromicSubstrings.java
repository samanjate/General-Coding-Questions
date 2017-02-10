// Returns all the palindromic substrings of a String 

// e.g. abcabccbab
//      abccba
//      bccb
//      cc
//      bab

import java.util.ArrayList;

public class AllPalindromicSubstrings {

	public ArrayList<String> findPalindromicString (String str) {

		char[] c = str.toCharArray();
		ArrayList<String> al = new ArrayList<String>();
		for(int i=0; i < c.length; i++) {
			for (int j=c.length-1; j>i; j--) {
				if(c[i]==c[j]) {
					int start_index = i;
					int end_index = j;
					while(end_index > start_index) {
						if(c[end_index] != c[start_index]) {
							break;
						} else {
							end_index--;
							start_index++;
							if(start_index>=end_index) {
								al.add(str.substring(i,j+1));
							} else {
								continue;
							}
						}
					}
				} else {
					continue;
				}
			}
		}
		return al;
	}

	public static void main(String[] args) {

		String str = new String("abcabccbab");
		Practice p = new Practice();
		ArrayList<String> answer = p.findPalindromicString(str);
		for (String a:answer) {
			System.out.println(a);
		}
	}
}
