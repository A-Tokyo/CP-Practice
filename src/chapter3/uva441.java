package chapter3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class uva441 {

	
	public static void lotto (int [] tokens, StringBuilder sb){
		for (int i = 0; i < tokens.length-5; i++) { // if I ever have to solve you again I'll die
			for (int j = i+1; j < tokens.length-4; j++) {
				for (int j2 = j+1; j2 < tokens.length-3; j2++) {
					for (int k = j2+1; k < tokens.length-2; k++) {
						for (int k2 = k+1; k2 < tokens.length-1; k2++) {
							for (int l = k2+1; l < tokens.length; l++) {
								sb.append(tokens[i]+" "+tokens[j]+" "+tokens[j2]+" "+tokens[k]+" "+tokens[k2]+" "+tokens[l]+"\n");
							}
						}
					}
				}
			}
		}
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
			while(true){
				String thisLine=br.readLine();
				StringTokenizer st = new StringTokenizer(thisLine);
				int k = Integer.parseInt(st.nextToken());
				if(k==0)
					break;
				int [] tokens = new int[k];
				for (int i = 0; i < tokens.length; i++) {
					tokens[i] = Integer.parseInt(st.nextToken());
				}
				lotto(tokens,sb);
				sb.append("\n");
			}
			sb.setLength(sb.length() - 2);
			System.out.print(sb);
	}
}