import java.util.Scanner;

public class skener {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] numbers = line.split(" ");
        int R = Integer.parseInt(numbers[0]);
        int C = Integer.parseInt(numbers[1]);
        int Zr = Integer.parseInt(numbers[2]);
        int Zc = Integer.parseInt(numbers[3]);
        String processingLine;
        for (int i = 0; i < R; i++) { //going down rows
            line = sc.nextLine();
            processingLine = "";
            for (int j = 0; j < C; j++) { //going along the row
                char current = line.charAt(j);
                for (int k = 0; k < Zc; k++) {
                    processingLine = processingLine + String.valueOf(current);
                }
            }
            for (int m = 0; m < Zr; m++) {
                System.out.println(processingLine);
            }
        }
    }
}