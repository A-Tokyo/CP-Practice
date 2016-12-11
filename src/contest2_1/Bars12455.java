package contest2_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bars12455 {

	public static boolean checkSum(int[] bars, int target) {
		int n = bars.length;
		int i = 0;
		for (i = 0; i < (1 << n); i++) { 
			int sum = 0;
			for (int j = 0; j < n; j++)
				if ((i & (1 << j)) != 0)
					sum += bars[j];
			if (sum == target){
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String thisLine;
		thisLine = br.readLine();
		int t = Integer.parseInt(thisLine);
		while (0 != t--) {
			thisLine = br.readLine();
			StringTokenizer st = new StringTokenizer(thisLine);
			int target = Integer.parseInt(st.nextToken());
			thisLine = br.readLine();
			st = new StringTokenizer(thisLine);
			int count = Integer.parseInt(st.nextToken());
			int[] bars = new int[count];
			thisLine = br.readLine();
			st = new StringTokenizer(thisLine);
			for (int i = 0; i < bars.length; i++) {
				bars[i] = Integer.parseInt(st.nextToken());
			} // done input
			if (checkSum(bars, target))
				sb.append("YES" + "\n");
			else
				sb.append("NO" + "\n");
		}
		System.out.print(sb);
	}
}