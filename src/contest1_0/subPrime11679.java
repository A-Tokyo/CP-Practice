package contest1_0;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class subPrime11679 {

	public static void settleDebts(int[][] debts, int credits[]) {
		for (int i = 0; i < debts.length; i++) {
			int debtor = debts[i][0];
			int creditor = debts[i][1];
			int amount = debts[i][2];
			credits[debtor] -= amount;
			credits[creditor] += amount;
		}
	}

	public static boolean checkSorN(int[] credits) {
		for (int i = 1; i < credits.length; i++) {
			if (credits[i] < 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		while (br.ready()) {
			String thisLine = br.readLine();
			StringTokenizer st = new StringTokenizer(thisLine);
			int B = Integer.parseInt(st.nextToken());
			int N = Integer.parseInt(st.nextToken());
			if(B==0 && N==0)
				break;
			int credits[] = new int[B + 1];
			int debts[][] = new int[B][3];
			thisLine = br.readLine();
			st = new StringTokenizer(thisLine);
			int j = 1;
			while (j <= B) {
				credits[j] = Integer.parseInt(st.nextToken());
				j++;
			}
			int i = 0;
			while (i < N) {
				thisLine = br.readLine();
				st = new StringTokenizer(thisLine);
				debts[i][0] = Integer.parseInt(st.nextToken());
				debts[i][1] = Integer.parseInt(st.nextToken());
				debts[i][2] = Integer.parseInt(st.nextToken());
				i++;
			}
			settleDebts(debts, credits);
			if (checkSorN(credits))
				sb.append("S" + "\n");
			else
				sb.append("N" + "\n");
		}
		System.out.print(sb);
	}
}