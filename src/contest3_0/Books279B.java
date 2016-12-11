package contest3_0;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Books279B {
	static int size, freeTime;
	static int[] books;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String array[] = br.readLine().split(" ");
		int n = Integer.parseInt(array[0]);
		freeTime = Integer.parseInt(array[1]);
		if (n == 0 || freeTime == 0) {
			System.out.println("0");
			return;
		}
		books = new int[n];
		array = br.readLine().split(" ");
		for (int i = 0; i < n; i++) {
			books[i] = Integer.parseInt(array[i]);
		}
		// done input
		int time = 0, first = 0, count = 0, best = 0;
		for (int i = 0; i < n; i++) {
			time += books[i];
			count++;
			while (time > freeTime) {
				count--;
				time -= books[first];
				first++;
			}
			if (count > best)
				best = count;
		}
		System.out.println(best);
	}
}