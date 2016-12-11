package graphPractice;

import Debug.Debug;

public class UVA118_MutantFlatworldExplorers {
	static int[][] Grid;
	static Pair curr = new Pair(0, 0);
	static int xLength, yLength;
	static StringBuilder sb = new StringBuilder();

	public static void Traverse(String directions,char orientation) {
		// Note that due to the fact that the first index of the 2d array is the y axis and the second
		//index is the x axis, the x and y are mirrored between N and E
		boolean isLost = false; //when a robot is lost it can't come back
		for (int i = 0; i < directions.length() && !isLost; i++) {
			isLost = false;
			switch (orientation) {
			case 'N':
				switch (directions.charAt(i)) {
				case 'R':
					orientation = 'E';
					break;
				case 'L':
					orientation = 'W';
					break;
				case 'F':
					curr.y -= 1;
					if (curr.y < 0)
						if (Grid[0][curr.x] == 2)
							curr.y += 1;
						else {
							Grid[yLength][curr.x] = 2;
							isLost = true;
						}
					break;
				}
				break;
			case 'S':
				switch (directions.charAt(i)) {
				case 'R':
					orientation = 'W';
					break;
				case 'L':
					orientation = 'E';
					break;
				case 'F':
					curr.y += 1;
					if (curr.y == yLength)
						if (Grid[yLength - curr.y -1][curr.x] == 2) // bug
							curr.y -= 1;
						else {
							Grid[yLength - curr.y -1][curr.x] = 2;
							isLost = true;
						}
					break;
				}
				break;
			case 'E':
				switch (directions.charAt(i)) {
				case 'R':
					orientation = 'S';
					break;
				case 'L':
					orientation = 'N';
					break;
				case 'F':
					curr.x += 1;
					if (curr.x == xLength){
						if (Grid[yLength - curr.y - 1][curr.x-1] == 2)
							curr.x -= 1;
						else {
							Grid[yLength - curr.y - 1][curr.x - 1] = 2;
							isLost = true;
						}
					}
					break;
				}
				break;
			case 'W':
				switch (directions.charAt(i)) {
				case 'R':
					orientation = 'N';
					break;
				case 'L':
					orientation = 'S';
					break;
				case 'F':
					curr.x -= 1;
					if (curr.x < 0)
						if (Grid[yLength - curr.y - 1][curr.x + 1] == 2)
							curr.x += 1;
						else {
							Grid[yLength - curr.y - 1][curr.x + 1] = 2;
							isLost = true;
						}
					break;
				}
				break;
			}
		}
		System.err.println(curr.x+","+curr.y+"which is "+(yLength - curr.y - 1));
		sb.append(curr.x+ " "+curr.y+" "+orientation);
		if(isLost)
			sb.append(" LOST");
		sb.append("\n");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Grid = new int[3][5];
		xLength=5; yLength=3;
		curr.x=0;curr.y=0;
		Traverse("F",'N');
		Debug.printArray2(Grid);
		if(sb.length()!=0)
		sb.setLength(sb.length()-1);
		System.out.print(sb);
	}

	static class Pair {
		int x, y;

		Pair(int a, int b) {
			x = a;
			y = b;
		}
	}
}