package contest2_0;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Pangram520A {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int length = Integer.parseInt(br.readLine());
		String thisLine = br.readLine();
		thisLine=thisLine.toLowerCase();
		String check="";
		if (length >= 26)
			for (int i = 0; i < length; i++) {
				if (!check.contains(thisLine.charAt(i) + "")) {
					check += thisLine.charAt(i);
				}
			}
		if (check.length() < 26)
			System.out.println("NO");
		else
			System.out.println("YES");
	}
}