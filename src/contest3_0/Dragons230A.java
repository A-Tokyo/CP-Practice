package contest3_0;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Dragons230A {

	static Dragon[] Dragons;
	static int strength;

	static class Dragon implements Comparable {
		int strength;
		int bonus;

		public Dragon(int strength, int bonus) {
			this.strength = strength;
			this.bonus = bonus;
		}
		public Dragon() {
			this.strength = 0;
			this.bonus = 0;
		}
		public String toString() {
			return "Strength = " + strength + ", Bonus = " + bonus + ".";
		}
		public int compareTo(Object o) {
			if (strength < ((Dragon) o).strength)
				return -1;
			if (strength > ((Dragon) o).strength)
				return 1;
			return 0;
		}
	}
	
	public static void checkAndPrint(){
		Arrays.sort(Dragons);
		int max = Dragons[Dragons.length-1].strength;
		for (int i = 0; i < Dragons.length&&strength<=max; i++) {
			if(strength>Dragons[i].strength){
				strength+=Dragons[i].bonus;
			}
		}
		System.out.println(strength>max?"YES":"NO");
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String array[] = br.readLine().split(" ");
		strength = Integer.parseInt(array[0]);
		int n = Integer.parseInt(array[1]);
		if(n==0){
			System.out.println("YES");
			return;
		}
		Dragons = new Dragon[n];
		for (int i = 0; i < n; i++) {
			array = br.readLine().split(" ");
			Dragons[i]= new Dragon(Integer.parseInt(array[0]), Integer.parseInt(array[1]));
		}
		checkAndPrint();
	}
}