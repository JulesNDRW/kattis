import java.util.Scanner;
import java.math.BigInteger;

public class pot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        BigInteger sum = BigInteger.ZERO;
        
        for (int i = 0; i < N; i++) {
            String currLine = sc.nextLine();
            int power = Character.getNumericValue(currLine.charAt(currLine.length() - 1));
            int number = Integer.parseInt(currLine.substring(0, currLine.length() - 1));
            sum = sum.add(BigInteger.valueOf(number).pow(power));
        }
        System.out.println(sum);
    }
}