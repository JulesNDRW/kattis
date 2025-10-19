import java.util.Scanner;

public class timeloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            int current = i + 1;
            System.out.println(current + " Abracadabra");
        };
    };
}