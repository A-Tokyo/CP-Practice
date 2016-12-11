package Intro;

public class PermutateString {

	public static void permutate(String string){
		permutate("",string);
	}
static boolean flag;
	private static void permutate(String prefix, String string) {
		int n = string.length();
		if(n==0)
			System.out.println(prefix);
		else{
			for (int i = 0; i < string.length(); i++) {
				permutate(prefix+string.charAt(i), string.substring(0,i)+string.substring(i+1));
			}
		}	
	}

	public static String printDistinct(String numbers){
		boolean[] memo = new boolean[10];
		String toReturn="";
		for (int i = 0; i < numbers.length(); i++) {
			int number = Integer.parseInt(""+numbers.charAt(i));
			if(!memo[number]){
				toReturn+=number;
				memo[number]=true;
			}
		}
		return toReturn;
	}

	public static String specialWord(String string){
		String star= "";
		for (int i = 0; i < string.length()-2; i++) {
			if(Character.isAlphabetic(((string.charAt(i))))&&
					Character.isDigit((string.charAt(i+1)))&&
					Character.isDigit((string.charAt(i+2)))){
				star+="***";
				i+=2;
			}else{
				star+=string.charAt(i);
			}
		}
		return star;
	}

	public static void main(String[] args) {
		permutate("ribon.13");
//		printDistinct("81378122");
//		System.out.println(specialWord("abca77abca26"));
	}
}