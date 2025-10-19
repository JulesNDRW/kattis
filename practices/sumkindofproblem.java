import java.util.*;

public class sumkindofproblem{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int P = Integer.parseInt(sc.nextLine());
		
		for (int i=0; i<P; i++) {
		    String[] currLine = sc.nextLine().split(" ");
		    int K = Integer.parseInt(currLine[0]);
		    int N = Integer.parseInt(currLine[1]);
		    
		    int S1 = N * (N+1) / 2;
		    int aN = 1 + 2 * (N-1); //AP odd term
		    int S2 = (N * (1 + aN)) / 2;
		    aN = 2 + 2 * (N-1); //AP even term
		    int S3 = (N * (2 + aN)) / 2;
		    
		    String output = String.valueOf(K) + " " + S1 + " " + S2 + " " + S3;
		    System.out.println(output);
		}

	}
}