package contest2_0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class EcologicalBinPacking102 {

	public static String doTheShit(int[] input) {
		String bestComb = "GGG";
		int bestNum = 1999999999;
		String currcomb = "";
		int curNum = 0;
		for (int a = 0; a < input.length - 2; a += 3) {
			for (int b = 1; b < input.length - 1; b += 3) {
				if (b == a + 1)
					continue;
				for (int c = 2; c < input.length; c += 3) {
					if (c == a + 2 || c == b + 1)
						continue;
					currcomb = translate("" + a + "" + b + "" + c);
					curNum = 0;
					for (int i = 0; i < input.length; i++){
						if (i != a && i != b && i != c) {
							curNum += input[i];
						}
					}
					if (((curNum == bestNum) && (currcomb.compareTo(bestComb) < 0)) || (curNum < bestNum)) {
						bestComb = currcomb;
						bestNum = curNum;
					}
				}
			}
		}
		return bestComb + " " + bestNum;
	}

	public static String translate(String s) {
		String out = "";
		String a[] = new String[3];
		for (int i = 0; i < 3; i++) {
			switch (s.charAt(i) + "") {
			case "0":
				a[0] = "B";
				break;
			case "3":
				a[1] = "B";
				break;
			case "6":
				a[2] = "B";
				break;
			case "1":
				a[0] = "G";
				break;
			case "4":
				a[1] = "G";
				break;
			case "7":
				a[2] = "G";
				break;
			case "2":
				a[0] = "C";
				break;
			case "5":
				a[1] = "C";
				break;
			case "8":
				a[2] = "C";
				break;
			default:
				;
			}
		}
		for (int i = 0; i < a.length; i++) {
			out += a[i];
		}
		return out;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int[] input = new int[9];
		String thisLine;
		while ((thisLine = br.readLine()) != null && thisLine.length() != 0) {
			StringTokenizer st = new StringTokenizer(thisLine);
			for (int i = 0; i < 9; i++) {
				input[i] = Integer.parseInt(st.nextToken());
			}
			sb.append(doTheShit(input) + "\n");
		}
		System.out.print(sb);
	}

}