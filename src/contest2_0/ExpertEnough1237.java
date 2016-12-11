package contest2_0;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ExpertEnough1237 {

	public static void query(String[] data, int[] leftPRange, int[] rightPRange, int[] queries, StringBuilder sb) {
		int count = 0;
		String out="";
		for (int i = 0; i < queries.length; i++) {
			for (int j = 0; j < data.length; j++) {
				if(queries[i]>=leftPRange[j] && queries[i] <= rightPRange[j]){
					count+=1;
					out+=data[j];
				}
			}
			if(count==1)
				sb.append(out+"\n");
			else
				sb.append("UNDETERMINED"+"\n");
			count=0;
			out="";
		}
		sb.append('\n');
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String thisLine;
		thisLine = br.readLine();
		int t = Integer.parseInt(thisLine);
		while (0 != t--) {
			thisLine = br.readLine();
			StringTokenizer st = new StringTokenizer(thisLine);
			int a = Integer.parseInt(st.nextToken());
			String data[] = new String[a];
			int leftPRange[] = new int[a];
			int rightPRange[] = new int[a];
			for (int i = 0; i < a; i++) {
				thisLine = br.readLine();
				st = new StringTokenizer(thisLine);
				data[i] = st.nextToken();
				leftPRange[i] = Integer.parseInt(st.nextToken());
				rightPRange[i] = Integer.parseInt(st.nextToken());
			}
			thisLine = br.readLine();
			st = new StringTokenizer(thisLine);
			int b = Integer.parseInt(st.nextToken());
			int queries[] = new int[b];
			for (int i = 0; i < b; i++) {
				thisLine = br.readLine();
				st = new StringTokenizer(thisLine);
				queries[i] = Integer.parseInt(st.nextToken());
			}
			// done taking input
			query(data, leftPRange, rightPRange, queries, sb);
		}
		sb.setLength(sb.length()-1);
		System.out.print(sb);
	}
}