package contest1_0;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ReverseAndAdd {
	public static String reverseAndAdd(String input) {
		int count = 0;
		int sum = 10;
		do {
			int x = Integer.parseInt(input);
			int y = Integer.parseInt(reverse(input));
			sum = x + y;
			input = "" + sum;
			count++;
		} while (!isPalindrome("" + sum));
		return "" + count + " " + sum;
	}

	public static String reverse(String input) {
		int n = input.length();
		String out = "";
		while (n > 0) {
			out += input.charAt(n - 1);
			n--;
		}
		return out;
	}

	public static boolean isPalindrome(String input) {
		int n = input.length();
		for (int i = 0; i < input.length() / 2; i++) {
			if (input.charAt(i) != input.charAt(n - i - 1))
				return false;
		}
		return true;
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (br.ready()) {
			String thisLine = br.readLine();
				int n = Integer.parseInt(thisLine);
				while ((n > 0)) {
					thisLine = br.readLine();
					System.out.println(reverseAndAdd(thisLine));
					n--;
				}
				break;
			}
		}
	}







//public class ReverseAndAdd{
//	
//	public static void main(String[] args) throws IOException
//	{
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringBuilder sb = new StringBuilder();
//		int t = Integer.parseInt(br.readLine());
//		for(int i = 0; i < t; i++)
//		{
//			long number = Integer.parseInt(br.readLine());
//			reverseAndAdd(number, sb);
//		}
//		System.out.print(sb);
//	
//		
//	}
//	
//	public static void reverseAndAdd(long number, StringBuilder sb)
//	{
//		int count = 0;
//		while(!isPalindrome(number))
//		{
//			count++;
//			number += reverse(number);
//		}
//		sb.append(count+" "+number+"\n");
//		
//	}
//	public static long reverse(long number)
//	{
//		return new Integer(new StringBuffer(""+number).reverse().toString());
//	}
//	
//	public static boolean isPalindrome(long number)
//	{
//		return isPalindrome(""+number);
//	}
//	
//	public static boolean isPalindrome(String s)
//	{
//		if(s.length()<=1)
//			return true;
//		if(s.charAt(0)!=s.charAt(s.length()-1))
//			return false;
//		return isPalindrome(s.substring(1,s.length()-1));
//	}
//
//}