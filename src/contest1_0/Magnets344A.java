package contest1_0;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Magnets344A {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(br.readLine());
		if (x==0){
			System.out.print("0");
			return;
		}
		int t = 1;
		int groups = 1;
		int mag = Integer.parseInt(br.readLine());
		while(t<x){
			int mag2 = Integer.parseInt(br.readLine());
			if(mag%10==mag2/10)
				groups++;
			mag = mag2;
			t++;
		}
		System.out.print(groups);
	}

}
