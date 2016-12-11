package contest1_0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Presents136A {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(br.readLine());
		if(x<1)
			return;
		int [] out = new int [x];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i=1;i<=x;i++){
			int y = Integer.parseInt(st.nextToken());
			out[y-1]=i;
		}
		for (int i = 0; i < out.length-1; i++) {
			System.out.print(out[i]+" ");
		}
		System.out.print(out[out.length-1]);
	}

}
