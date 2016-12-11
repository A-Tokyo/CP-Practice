package contest2_0;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PrimeRingProblem524 {

	static int[] ring;
	static int[] prime;
	static StringBuilder sb = new StringBuilder();

	public static boolean check(int c, int num) {
		for (int i = 0; i < ring.length; i++) {
			if (i < c && num == ring[i])
				return false;
			if (i == c) {
				int prev = (i - 1 == -1) ? ring.length - 1 : i - 1;
				int next = (i + 1 == ring.length) ? 0 : i + 1;
				if ((ring[next] == 0 && ring[prev] == 0) || (ring[next] == 0 && isPrime(num + ring[prev]))
						|| (isPrime(num + ring[prev]) && isPrime(num + ring[next]))) {
					return true;
				}
			}
		}
		return false;
	}

	public static void backtrack(int c) {
		if (c == ring.length) {
			for (int i = 0; i < ring.length-1; i++) {
				sb.append(ring[i]+" ");
			}
			sb.append(ring[ring.length-1]+"\n");
		}
		for (int i = 2; i <= ring.length; i++) { // try placing all possible numbers
			if (check(c, i)) { // check if you can place i in the ring at position c
				ring[c] = i; // place
				backtrack(c + 1); // recurse to the next position in the ring
				ring[c] = 0; // remove the placed i as all it's permutations have been tried
							// restarting this position c in the ring for another i
			}
		}
	}

	private static boolean isPrime(int num) {
		if (num == 2 || prime[num] == 1)
			return true;
		if (num % 2 == 0 || prime[num] == -1) {
			prime[num] = -1;
			return false;
		}
		for (int i = 3; i * i <= num; i += 2)
			if (num % i == 0) {
				prime[num] = -1;
				return false;
			}
		prime[num] = 1;
		return true;
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		prime = new int[32];
		int i = 1;
		String thisLine;
		while((thisLine=br.readLine())!=null && thisLine.length()!=0){
			sb.append("Case "+i+":\n");
			int size = Integer.parseInt(thisLine);
			ring = new int[size];
			ring[0] = 1;
			backtrack(1); // start placing from position 1
			sb.append("\n");
			i++;
		}
		sb.setLength(sb.length()-1);
		System.out.print(sb);
	}
}