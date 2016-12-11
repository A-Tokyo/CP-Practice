package contest2_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SimpleEquations11565 {

	public static void solve(int A, int B, int C, StringBuilder sb) {

		boolean sol = false;
		int x, y, z;
		for (x = -22; x <= 22 && !sol; x++)
			if (x * x <= C)
				for (y = -100; y <= 100 && !sol; y++)
					if (y != x && x * x + y * y <= C)
						for (z = -100; z <= 100 && !sol; z++)
							if (z != x && z != y && x + y + z == A && x * y * z == B && x * x + y * y + z * z == C) {
								sb.append(x + " " + y + " " + z);
								sol = true;
							}
		if (!sol)
			sb.append("No solution.");
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		for (int i = 0; i < t; i++) {
			String thisLine = br.readLine();
			StringTokenizer st = new StringTokenizer(thisLine);
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			solve(a, b, c, sb);
			if (t - 1 != i)
				sb.append("\n");
		}
		System.out.print(sb);
	}
}
