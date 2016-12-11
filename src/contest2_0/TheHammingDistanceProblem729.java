package contest2_0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TheHammingDistanceProblem729 {

	static int hamDistance, size;
	static int[] output;
	static StringBuilder sb = new StringBuilder();

	public static boolean check(int k) {
		int counter = 0;
		for (int i = 0; i < output.length; i++)
			if (output[i] == 1)
				if (++counter >= hamDistance || i >= k)
					return false;
		return true;
	}

	public static void backtrack(int c) {
		if (c == (hamDistance)) {
			for (int i = size - 1; i > -1; i--) {
				sb.append(output[i]);
			}
			sb.append("\n");
			return;
		}
		for (int i = 0; i < size; i++) {
			if (check(i)) {
				output[i] = 1;
				backtrack(c + 1);
				output[i] = 0;
			}
		}
	}

	public static void begin() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String thisLine;
		try{
		thisLine = br.readLine();
		}catch(Exception e){
			return;
		}
		int TC = Integer.parseInt(thisLine);
		int c = 0;
		try {
			while (c < TC && (thisLine = br.readLine()) != null && thisLine.length() != 0) {
				StringTokenizer st = new StringTokenizer(thisLine);
				size = Integer.parseInt(st.nextToken());
				hamDistance = Integer.parseInt(st.nextToken());
				output = new int[size];
				backtrack(0);
				sb.append("\n");
				c++;
			}
		} catch (Exception e) {
			return;
		}
		sb.setLength(sb.length()-1);
		System.out.print(sb);
	}

	public static void main(String[] args) throws Exception {
		TheHammingDistanceProblem729 myWork = new TheHammingDistanceProblem729();
		myWork.begin();
	}
}