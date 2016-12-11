package contest1_0;

import java.io.*;
public class oddSum10783 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		for(int i = 0; i < t; i++){
			int lb = Integer.parseInt(br.readLine());
			int rb = Integer.parseInt(br.readLine());
			int sum=0;
			if(lb%2==0)
				lb=lb+1;
			while(lb<rb){
				sum+=lb;
				lb+=2;
			}
			if(rb%2==1)
				sum+=rb;
			sb.append("Case "+(i+1)+": "+sum+"\n");
		}
		System.out.print(sb);
	}
}
