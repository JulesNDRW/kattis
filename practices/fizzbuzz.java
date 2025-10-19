import java.util.Scanner;

public class fizzbuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] numbers = input.split(" ");
        int endPoint = Integer.parseInt(numbers[2]);
        int x = Integer.parseInt(numbers[0]);
        int y = Integer.parseInt(numbers[1]);
        for (int i = 1; i <= endPoint; i++) {
            if (i % x == 0) {
                if (i % y == 0) {
                    System.out.println("FizzBuzz");
                } else {
                    System.out.println("Fizz");
                }
            } else if (i % y == 0 ) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}