import java.util.Scanner;
import java.util.Arrays;

public class numberfun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < N; i++) {
            String line = sc.nextLine();
            String[] numbers = line.split(" ");
            int first = Integer.parseInt(numbers[0]);
            int second = Integer.parseInt(numbers[1]);
            int c = Integer.parseInt(numbers[2]);
            int a, b;
            if (first <= second ) {
                a = first;
                b = second;
            } else {
                a = second;
                b = first;
            }
            int[] possibleC;
            if (b % a == 0) {
                possibleC = new int[]{a+b, b-a, a*b, b/a};
            } else {
                possibleC = new int[]{a+b, b-a, a*b, -1};
            }
            boolean bool = Arrays.stream(possibleC).anyMatch(x -> x == c);
            if (bool) {
                System.out.println("Possible");
            } else {
                System.out.println("Impossible");
            }
        };
    };
}