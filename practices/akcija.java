import java.io.*;
import java.util.*;

public class akcija {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Integer[] input = new Integer[N];
        for (int i=0; i<N; i++) {
            int k = Integer.parseInt(br.readLine());
            input[i] = k;
        }
        Arrays.sort(input, Collections.reverseOrder());
        int sum = 0;
        for (int j=0; j<N; j++) {
            if ((j+1) % 3 != 0) {
                sum += input[j];
            }
        }
        System.out.println(sum);
    }
}
