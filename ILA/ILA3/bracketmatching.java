import java.io.*;
import java.util.*;

import static java.util.Map.entry;

public class bracketmatching {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String input = br.readLine();
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> corr = Map.ofEntries(
            entry('"', '"'),
            entry('{', '}'),
            entry('[', ']'),
            entry('(', ')')
        );
        boolean flag = true;
        for (int i=0;i<N;i++) {
            Character curr = input.charAt(i);
            if (corr.containsKey(curr)) {
                stack.push(curr);
            } else {
                if (stack.empty()) {
                    flag = false;
                } else {
                    Character match = stack.pop();
                    Character correct = corr.get(match);
                    if (!correct.equals(curr)) {
                        flag = false;
                    }
                }
            }
        }
        if (flag && stack.empty()) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }
}
