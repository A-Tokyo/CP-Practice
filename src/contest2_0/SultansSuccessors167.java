package contest2_0;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SultansSuccessors167 {

	static int[] row = new int[8];
	static int[][] board = new int[8][8];
	static int sum, max;
	static StringBuilder sb = new StringBuilder();

	public static boolean place(int r, int c) {
		for (int prev = 0; prev < c; prev++)
			if (row[prev] == r || (Math.abs(row[prev] - r) == Math.abs(prev - c)))
				return false;
		return true;
	}

	public static void backtrack(int c) {
		if (c == 8 && sum > max) {
			max = sum;
			return;
		}
		for (int r = 0; r < row.length; r++) {
			if (place(r, c)) {
				sum += board[r][c];
				row[c] = r;
				backtrack(c + 1);
				sum -= board[r][c];
			}
		}
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		String thisLine = "";
		StringTokenizer st = new StringTokenizer(thisLine);
		while (tc-- != 0) {
			int i = 0;
			for (int k = 0; k < 8; k++) {
				st = new StringTokenizer(br.readLine());
				for (int j = 0; j < 8; j++) {
					board[i][j] = Integer.parseInt(st.nextToken());
				}
				i++;
			}
			backtrack(0);
			String out = "" + max;
			while (out.length() < 5) {
				out = " " + out;
			}
			sb.append(out + "\n");
		}
		sb.setLength(sb.length()-1);
		System.out.print(sb);
	}
}