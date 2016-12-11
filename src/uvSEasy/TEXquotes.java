package uvSEasy;
import java.io.BufferedReader;
import java.io.InputStreamReader;
//Accepted no. 1
public class TEXquotes {
	static boolean right = false;
	public static String TexQuote(String string){
		String toReturn="";

		for (int i = 0; i < string.length(); i++) {
			if(string.charAt(i)=='"'){
				if(right){
					toReturn+="''";
					right=false;
				}else{
					toReturn+="``";
					right=true;
				}
			}
			else
				toReturn+=string.charAt(i);
		}
		return toReturn;
	}
	

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String  thisLine = br.readLine();
		int n = Integer.parseInt(thisLine);
		for(int i=0; i<n;i++){
			thisLine=br.readLine();
			String Coordinates="";
			int x=0;
		for (int j = 0; j < thisLine.length(); j++) {
				if(thisLine.charAt(j)!=' ')
				Coordinates+=thisLine.charAt(j);
				else {
					x =Integer.parseInt(Coordinates);
					Coordinates="";
				}
			}
			int y = Integer.parseInt(Coordinates);
			if(x==y)
				System.out.println("=");
			else
			System.out.println((x<y)?"<":">");
		}br.close();
	}
}