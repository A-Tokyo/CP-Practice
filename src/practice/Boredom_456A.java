package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boredom_456A {
	
	static int [] count = new int [1000005];
	static int n;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		String [] thisLine = br.readLine().split(" ");
		for (int i = 0; i<thisLine.length; i++) {
			count[Integer.parseInt(thisLine[i])]++;
		}
		System.out.println(maxScore(n));
	}

	static int maxScore(int i) {
		if(i==0)
			return 0;
		if (i==1)
			return count[1];
		return Math.max(maxScore(i-1), maxScore(i-2)+count[i]*i); 
	}
}
