import java.util.Scanner;

public class detaileddifferences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for (int i=0; i<n; i++) {
            String output = "";
            String a = sc.nextLine();
            String b = sc.nextLine();
            for (int j=0; j<a.length(); j++) {
                char first = a.charAt(j);
                char second = b.charAt(j);
                if (first==second) {
                    output = output + ".";
                } else {
                    output = output + "*";
                }
            }
            System.out.println(a);
            System.out.println(b);
            System.out.println(output);
        }
    }
}