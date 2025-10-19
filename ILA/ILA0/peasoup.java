import java.util.*;

public class peasoup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());;
        boolean peasoup = false;
        boolean pancakes = false;
        
        for (int i = 0; i < n; i++) {
            int k = Integer.parseInt(sc.nextLine());
            String name = sc.nextLine();
            peasoup = false;
            pancakes = false;
            for (int j = 0; j < k; j++) {
                String currItem = sc.nextLine();
                if (currItem.equals("pea soup")) {
                    peasoup = true;
                } else if (currItem.equals("pancakes")) {
                    pancakes = true;
                }
            }
            if (peasoup && pancakes) {
                System.out.println(name);
                break;
            }
        }
        if (!(peasoup && pancakes)) {
            System.out.println("Anywhere is fine I guess");
        }
    }
}