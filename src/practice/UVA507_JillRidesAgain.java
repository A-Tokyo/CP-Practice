package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UVA507_JillRidesAgain {

	static int memo [];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String thisLine = br.readLine();
		StringBuilder sb = new StringBuilder();
		int routes =Integer.parseInt(thisLine);
		for (int route = 1; route <= routes; route++) {		
			thisLine = br.readLine().trim();
			int stops =Integer.parseInt(thisLine);
			memo = new int [stops];
			for (int i = 1; i < stops; i++) {
				thisLine = br.readLine().trim();
				memo[i] = Integer.parseInt(thisLine);
			}
	        int currStart = 0, start = 0, end = 0, sum = 0, max = 0;
	        for(int currEnd = 1; currEnd < stops; currEnd++) {
	            sum += memo[currEnd];
	            if(sum > max || (sum == max && currEnd - currStart > end - start)) {
	                max = sum;
	                end = currEnd;
	                start = currStart;
	            }
	            if(sum < 0) {
	                currStart = currEnd;
	                sum = 0;
	            }
	        }
			if(max==0){				
				sb.append("Route "+route+" has no nice parts\n");
			}
			else{				
				sb.append("The nicest part of route "+route+" is between stops "+(start+1)+" and "+(end+1)+"\n");
			}
		}
		br.close();
		System.out.print(sb.toString());
	}
}
