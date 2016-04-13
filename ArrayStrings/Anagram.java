import java.util.*;
public class Anagram {
	public static void checkAnagram(String str1,String str2) {
		char[] s1 = str1.toCharArray();
		char[] s2 = str2.toCharArray();
		Arrays.sort(s1);
		Arrays.sort(s2);
		if(Arrays.equals(s1,s2)) {
			System.out.println("It's an anagram");
		} else {
			System.out.println("Not an anagram");
		}
	}
	public static void main(String[] args) {
		String str1 = new String("anagram");
		String str2 = new String("nag a ram");
		str1 = str1.replaceAll("\\s+","");
		str2 = str2.replaceAll("\\s+","");
		System.out.println(str1+"\n");
		System.out.println(str2+"\n");
		if(str1.length() == str2.length()) {
			checkAnagram(str1,str2);
		} else {
			System.out.println("Not an anagram");
		}
	}
}