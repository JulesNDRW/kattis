import java.util.Scanner;

public class autori {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String output = "";
        for (int i = 0; i < input.length(); i++) {
            char curr = input.charAt(i);
            if (Character.isUpperCase(curr)) {
                output = output + curr;
            }
        };
        System.out.println(output);
    }
}