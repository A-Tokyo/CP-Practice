package contest1_0;

import java.io.PrintWriter;
import java.util.Scanner;

public class uva11364 {
 
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    PrintWriter out = new PrintWriter(System.out);
    int T = sc.nextInt();
    while (T > 0) {
      int N = sc.nextInt();
      int min = Integer.MAX_VALUE;
      int max = Integer.MIN_VALUE;
      for (int i = 0; i < N; i++) {
        int next = sc.nextInt();
        min = Math.min(min, next);
        max = Math.max(max, next);
      }
      out.println(2 * (max - min));
      T--;
    }
    out.close();
    sc.close();
  }
 
}