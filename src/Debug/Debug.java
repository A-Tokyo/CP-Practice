package Debug;
public class Debug {
	public static void printArray (int [] x){
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i]+" ");
		}
		System.out.println("");
	}
		
		public static void printArray2 (int [][] x){
			for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				System.out.print(x[i][j]+ " ");
			}
			System.out.println("");
			}
	}
		
	public static String arrayToString(int [] [] array) {
		String result = "";
		for(int i = 0; i<array.length; i++){
			result+=("[ ");
		    for(int j = 0; j<array[i].length; j++){
		    	result+=(array[i][j] + (j==array.length-1?" ]":", "));
		    }
		    result+="\n";
		}
		return result;
	}	
}
