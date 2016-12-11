package contest2_0;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Team231A {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int solve = 0;
		String in[] = new String[3];
		while (n-- != 0) {
			in = br.readLine().split(" ");
			if (Integer.parseInt(in[0]) + Integer.parseInt(in[1]) + Integer.parseInt(in[2]) > 1)
				solve++;
		}
		System.out.println(solve);
	}
}
