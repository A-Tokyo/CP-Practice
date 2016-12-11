package contest3_0;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class RankList166A {
	static team[] teams;
	static int place;

	static class team implements Comparable<team> {
		int problems;
		int time;

		public team(int problems, int time) {
			this.problems = problems;
			this.time = time;
		}

		public int compareTo(team team) {
			if (this.problems > ((team) team).problems
					|| (this.problems == ((team) team).problems && this.time < ((team) team).time))
				return -1;
			if (this.problems < ((team) team).problems
					|| (this.problems == ((team) team).problems && this.time > ((team) team).time))
				return 1;
			return 0;
		}
	}

	public static int findTeams() {
		int teamCount = 1;
		int i = place;
		while (i > 0 && teams[i - 1].compareTo(teams[i]) == 0) {
			teamCount++;
			i--;
		}
		i = place;
		while (i < teams.length - 1 && teams[i + 1].compareTo(teams[i]) == 0) {
			teamCount++;
			i++;
		}
		return teamCount;
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String array[] = br.readLine().split(" ");
		int n = Integer.parseInt(array[0]);
		place = Integer.parseInt(array[1]);
		if (n == 0 || place == 0 || place > n) { // defensive programming
			System.out.println("0");
			return;
		}
		teams = new team[n];
		for (int i = 0; i < n; i++) {
			array = br.readLine().split(" ");
			teams[i] = new team(Integer.parseInt(array[0]), Integer.parseInt(array[1]));
		}
		// done input
		place--; // switching to zero based indexing
		Arrays.sort(teams);
		System.out.println(findTeams());
	}
}