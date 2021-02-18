// Problem - https://leetcode.com/problems/string-compression/
// Problem - https://www.pepcoding.com/resources/online-java-foundation/string,-string-builder-and-arraylist/string-compression-official/ojquestion

// 1. You are given a string. 
// 2. You have to compress the given string in the following two ways - 
//   First compression -> The string should be compressed such that consecutive duplicates of characters are replaced with a single character.
//   For "aaabbccdee", the compressed string will be "abcde".
//   Second compression -> The string should be compressed such that consecutive duplicates of characters are replaced with the character and followed by the number of consecutive      
//   duplicates.
//   For "aaabbccdee", the compressed string will be "a3b2c2de2".





import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework


class stringCompression {
	public static String compression(String s)
	{
		String s1 = s.charAt(0) +"";

		for(int i=1;i<s.length();i++)
		{
			char curr = s.charAt(i);
			char prev = s.charAt(i-1);

			if(curr != prev){
				s1 += curr;
			}
		}
		return s1;
	}


	public static String compressionCount(String s)
	{
		String s1 = s.charAt(0) +"";
		int count=1;

		for(int i=1;i<s.length();i++)
		{
			char curr = s.charAt(i);
			char prev = s.charAt(i-1);

			if(curr == prev){
				count++;
			}
			else{
				if(count>=1){
					s1+=count;
					count=1;
				}
				s1+=curr;
			}
		}
		if(count>=1){
			s1+=count;
			count=1;
		}
		return s1;
	}
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while(test-- > 0)
		{
			String s = sc.next();
			System.out.println(compression(s));
			System.out.println(compressionCount(s));
			
		}
		
		
	}
}