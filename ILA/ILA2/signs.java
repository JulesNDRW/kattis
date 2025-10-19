import java.io.*;
import java.util.*;

public class signs {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        TreeMap<String, String> map = new TreeMap<>();
        Map<String, Integer> dict = new HashMap<>();
        for (int i=0; i<N; i++) {
            String sign = br.readLine();
            String middle;
            int index;
            if (sign.length()%2==0) { //even
                index = Math.floorDiv(sign.length(), 2);
                middle = sign.substring(index-1, index+1);
            } else { //odd
                index = Math.floorDiv(sign.length(), 2);
                middle = String.valueOf(sign.charAt(index));
            }
            if (map.containsKey(middle)) {
                int curr = dict.get(middle);
                String zero = "0";
                String newMiddle = middle + zero.repeat(curr);
                map.put(newMiddle, sign);
                dict.put(middle, curr+1);
            } else {
                map.put(middle, sign);
                dict.put(middle, 1);
            }
        }
        for (Map.Entry<String, String> entry: map.entrySet()) {
            System.out.println(entry.getValue());
        }
    }
}
