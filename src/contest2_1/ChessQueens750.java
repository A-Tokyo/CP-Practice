package contest2_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ChessQueens750 {

	static int[] row = new int[8];
	static int a, b, lineCounter;
	static StringBuilder sb = new StringBuilder("SOLN       COLUMN" + "\n" + "#      1 2 3 4 5 6 7 8" + "\n"+"\n");

	public static boolean place(int r, int c) {
		for (int prev = 0; prev < c; prev++)
			if (row[prev] == r || (Math.abs(row[prev] - r) == Math.abs(prev - c)))
				return false;
		return true;
	}

	public static void backtrack(int c) {
		if (c == 8 && row[b] == a) {
			sb.append(++lineCounter + "      ");
			for (int i = 0; i < row.length; i++) {
				sb.append(row[i] + 1);
			}
			sb.append("\n");
			return;
		}
		for (int r = 0; r < row.length; r++) {
			if (place(r, c)) {
				if(r==a && c!=b)
					return;
				row[c] = r;
				backtrack(c + 1);
			}
		}
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		String thisLine = br.readLine();
		int TC;
		if(thisLine!=null && thisLine.length()!=0)
			TC = Integer.parseInt(thisLine);
		else
			return;
		if(TC==0)
			return;
		while (TC!= 0) {
			st = new StringTokenizer(br.readLine());
			a = Integer.parseInt(st.nextToken()) - 1;
			b = Integer.parseInt(st.nextToken()) - 1;
			if(a<8 && b<8)
				backtrack(0);
			lineCounter = 0;
			sb.append("\n");
			TC--;
		}
		sb.setLength(sb.length() - 1);
		System.out.print(sb);
		br.close();
		br=null;
	}
}