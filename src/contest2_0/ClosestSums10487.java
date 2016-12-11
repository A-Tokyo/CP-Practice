package contest2_0;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ClosestSums10487 {
	public static int checkSum(int[] list, int target) {
		int n = list.length;
		int closestSum = 1000000000;
		int sum = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == j)
					continue;
				sum = list[i] + list[j];
				int difference = 0;
				difference = (sum > target) ? (sum - target) : (target - sum);
				if (target > closestSum) {
					if ((target - closestSum) > difference) {
						closestSum = sum;
					}
				} else {
					if ((closestSum - target) > difference) {
						closestSum = sum;
					}
				}
			}
		}

		return closestSum;
	}

	public static void main(String[] args) throws Exception {
//		int n[] = { 1, 2, 3 };
//		System.out.println(checkSum(n, 6));
		 BufferedReader br = new BufferedReader(new
		 InputStreamReader(System.in));
		 StringBuilder sb = new StringBuilder();
		 String thisLine = br.readLine();
		 int n;
		 int i = 0;
		 while ((n = Integer.parseInt(thisLine)) != 0) {
		 sb.append("Case " + (++i) + ":" + "\n");
		 int[] list = new int[n];
		
		 for (int j = 0; j < n; j++)
		 list[j] = Integer.parseInt(br.readLine());
		
		 int m = Integer.parseInt(br.readLine());
		 int q;
		 for (int j = 0; j < m; j++) {
		 q = Integer.parseInt(br.readLine());
		 sb.append("Closest sum to " + q + " is " + checkSum(list, q) + "." +
		 "\n");
		 }
		 thisLine = br.readLine();
		 }
		 System.out.print(sb);
	}
}
