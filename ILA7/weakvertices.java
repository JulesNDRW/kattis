import java.util.*;
import java.io.*;

public class weakvertices {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n;
        while (true) { //through matrices
            n = Integer.parseInt(br.readLine());
            if (n == -1) break;
            int[][] matrix = new int[n][n];
            for (int i = 0; i < n; i++) { //initialising the curr matrix
                String[] curr = br.readLine().split(" ");
                int[] currInt = new int[curr.length];
                for (int j = 0; j < curr.length; j++) currInt[j] = Integer.parseInt(curr[j]);
                matrix[i] = currInt;
            }
            List<Integer> weak = new ArrayList<>();
            //for each vertex k along one axis
            //list of neighbours
            //for each pair of neighbours
            //check if pair == 1
            for (int k=0; k<n; k++) {
                boolean strength = false;
                for (int m=0; m<n && !strength; m++) {
                    if (matrix[k][m] == 1) { //if they're neighbours
                        for (int j=m+1; j<n; j++) {
                            if (matrix[k][j] == 1 && matrix[m][j] == 1) {
                                strength = true;
                                break;
                            }
                        }
                    }
                }
                if (!strength) weak.add(k);
            }
            Collections.sort(weak);
            StringBuilder s = new StringBuilder();
            for (Integer integer : weak) s.append(" ").append(String.valueOf(integer));
            if (!s.isEmpty()) s = new StringBuilder(s.substring(1));
            System.out.println(s);
        }
    }
}
