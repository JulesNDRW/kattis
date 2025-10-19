import java.util.Scanner;

public class lastfactorialdigit {
    static int lastDigit(int K) {
        if (K <= 2) return K;
        else if (K == 3) return 6;
        else if (K == 4) return 4;
        else return 0;
    };
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            System.out.println(lastDigit(N));
        };
    };
}