package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class puzzles_337A {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new
				InputStreamReader(System.in));
		String [] currLine = br.readLine().split(" ");
		int n = Integer.parseInt(currLine[0]);
		int m = Integer.parseInt(currLine[1]);
		int[] data = new int[m];
		currLine = br.readLine().split(" ");
		for(int i = 0; i<m; i++) 
			data[i] = Integer.parseInt(currLine[i]);
		Arrays.sort(data);
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < m - n + 1; i++) {
            min = Math.min(min, data[i+n-1] - data[i]);
        }
		System.out.println(min);
	}
}
