package contest1_0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class luckyDivision122A {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		isLucky(Integer.parseInt(br.readLine()));
	}

	public static void isLucky(int x) {
		int lucky[] = { 4, 7, 44, 47, 74, 77, 444, 447, 474, 477, 744, 747, 774, 777 };
		for (int j = 0; j < lucky.length; j++) {
			if (x % lucky[j] == 0) {
				System.out.print("YES");
				return;
			}
		}
		System.out.print("NO");
	}

}
