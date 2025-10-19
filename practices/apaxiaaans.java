import java.util.Scanner;

public class apaxiaaans {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String output = String.valueOf(input.charAt(0));
        for (int i = 1; i < input.length(); i++) {
            char current = output.charAt(output.length()-1);
            char next = input.charAt(i);
            if (current != next) {
                output = output + String.valueOf(next);
            }
        }
        System.out.println(output);
    }
}