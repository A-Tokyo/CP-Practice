package contest1_0;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class carryOrNot10469 {

	public static String wierdCount(String x, String y) {
		while (x.length() < 32)
			x = "0" + x;
		while (y.length() < 32)
			y = "0" + y;
		String out = "";
		for (int i = 31; i >= 0; i--) {
			if ((x.charAt(i) == '0' && y.charAt(i) == '1') || (x.charAt(i) == '1' && y.charAt(i) == '0'))
				out = "1" + out;
			else
				out = "0" + out;
		}
		return out;
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String thisLine;
		thisLine = br.readLine();
//		while ((thisLine = br.readLine()) != null) {
				StringTokenizer st = new StringTokenizer(thisLine);
				int x1 = Integer.parseInt(st.nextToken());
				int y1 = Integer.parseInt(st.nextToken());
				String x = Integer.toBinaryString(x1);
				String y = Integer.toBinaryString(y1);
				String out = wierdCount(x, y);
				sb.append(""+Integer.parseInt(out, 2)+"\n");
//		}
		System.out.print(sb);
	}

}
