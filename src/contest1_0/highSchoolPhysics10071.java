package contest1_0;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class highSchoolPhysics10071 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String thisLine;
		while (br.ready()) {
			thisLine = br.readLine();
			StringTokenizer st = new StringTokenizer(thisLine);
			while (st.hasMoreTokens()) {
				int v = Integer.parseInt(st.nextToken());
				int t = Integer.parseInt(st.nextToken());
				if(v<=100 && v >=-100 && t>=0 && t<=200)
				System.out.println(2*v*t);
			}
		}
	}
}
