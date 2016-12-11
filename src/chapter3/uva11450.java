package chapter3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class uva11450 {
	static int M, C;
	static int [][] price = new int [25][25];
	static int [][] memo = new int [210][25];
	
	static int shop(int money, int g) {
		if (money < 0) return -1000000000;
		if (g == C) return M - money;
		if (memo[money][g] != -1) return memo[money][g];
		int ans = -1;
		for (int model = 1; model <= price[g][0]; model++){
		     ans = Math.max(ans, shop(money - price[g][model], g + 1));
		}
		return memo[money][g] = ans;
	}
	
	public static void main(String[] args) throws IOException {
		int i, j, TC, score;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String thisLine=br.readLine();
		TC = Integer.parseInt(thisLine);
		while (true) {
			thisLine=br.readLine();
		    String thisLineSplit [] = thisLine.split(" ");
		    M = Integer.parseInt(thisLineSplit[0]);
		    C = Integer.parseInt(thisLineSplit[1]);
		    for (i = 0; i < C; i++) {
				thisLine=br.readLine();
				thisLineSplit = thisLine.split(" ");
		        price[i][0] = Integer.parseInt(thisLineSplit [0]);
		        for (j = 1; j <= price[i][0]; j++)
		        price[i][j] = Integer.parseInt(thisLineSplit [j]);
		    }
		for (int k = 0; k < memo.length; k++) {
			for (int k2 = 0; k2 < memo[k].length; k2++) {
				memo[k][k2]=-1;
			}
		}
		score = shop(M, 0);
		if (score < 0)
		System.out.println("no solution");
		else
			System.out.println(score);
		TC--;
		if(TC == 0)
			break;
		}
	}
}



//
//main.cpp
//cpPractice
//
//Created by Ahmed Mohamed on 12/9/16.
//Copyright © 2016 Ahmed Mohamed. All rights reserved.
//