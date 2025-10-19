import java.io.*;
import java.util.*;


public class conformity {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i<N; i++) {
            //processing
            String line = br.readLine();
            String[] str = line.split(" ");
            Arrays.sort(str);
            String concat = String.join("", str);
            //hashing
            int hashCode = concat.hashCode();
            if (map.containsKey(hashCode)) {
                map.put(hashCode, map.get(hashCode) + 1);
            } else {
                map.put(hashCode, 1);
            }
        }
        //find max
        int max = 0;
        for (Integer val : map.values()) {
            if (val>max) max = val;
        }
        int kids = 0;
        for (Integer val : map.values()) {
            if (val == max) kids++;
        }
        System.out.println(max*kids);
    }
}
