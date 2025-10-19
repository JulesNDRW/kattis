import java.util.*;
import static java.util.Map.entry;

public class t9spelling {
    public static void main(String[] args) {
        //initialise a map with key:value pairs letter:integer
        Map<String, String> keypad = Map.ofEntries(
            entry("a", "2"),
            entry("b", "22"),
            entry("c", "222"),
            entry("d", "3"),
            entry("e", "33"),
            entry("f", "333"),
            entry("g", "4"),
            entry("h", "44"),
            entry("i", "444"),
            entry("j", "5"),
            entry("k", "55"),
            entry("l", "555"),
            entry("m", "6"),
            entry("n", "66"),
            entry("o", "666"),
            entry("p", "7"),
            entry("q", "77"),
            entry("r", "777"),
            entry("s", "7777"),
            entry("t", "8"),
            entry("u", "88"),
            entry("v", "888"),
            entry("w", "9"),
            entry("x", "99"),
            entry("y", "999"),
            entry("z", "9999"),
            entry(" ", "0")
        );

        //initialise scanner to read input
        Scanner sc = new Scanner(System.in);
        //read the first integer N
        int N = Integer.parseInt(sc.nextLine());

        for (int i=1; i<=N; i++) {
            String input = sc.nextLine();
            String output = "Case #" + i + ": ";
            for (int k=0; k<input.length(); k++) {
                String num = keypad.get(String.valueOf(input.charAt(k)));
                char firstValue = num.charAt(0);
                char lastValue = output.charAt(output.length()-1);
                if (firstValue == lastValue) {
                    output = output + " " + num;
                } else {
                    output = output + num;
                }
            }
            System.out.println(output);
        }
    }
}