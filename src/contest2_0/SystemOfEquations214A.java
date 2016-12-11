package contest2_0;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SystemOfEquations214A {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] in = br.readLine().split(" ");
		int n = Integer.parseInt(in[0]);
		int m = Integer.parseInt(in[1]);
		int pair = 0;
		for (int a = 0; a < 32; a++)
			for (int b = 0; b < 1000 - (a * a); b++)
				if (a * a + b == n && a + b * b == m)
					pair++;
	System.out.println(pair);
	}
}
