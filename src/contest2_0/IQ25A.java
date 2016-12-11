package contest2_0;


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class IQ25A {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] input = br.readLine().split(" ");
		String out = "";
		int a = Integer.parseInt(input[0])%2;
		int b = Integer.parseInt(input[1])%2;
		boolean even = false;
		int i = 2;
		while (i < n) {
			if (Integer.parseInt(input[i]) % 2 != a && Integer.parseInt(input[i]) % 2 != b) {
				out += (i + 1);
				break;
			} else if (Integer.parseInt(input[i]) % 2 == 0)
				even = true;
			i++;
		}
		if (i == n) {
			if (even){
				if (a == 0)
					out += 2;
				else
					out += 1;
		}else 
			if (a == 1)
				out += 2;
			else
				out += 1;
		}
	System.out.println(out);
	}
}
