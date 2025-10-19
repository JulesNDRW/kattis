import java.util.*;

public class shatteredcake{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int W = Integer.parseInt(sc.nextLine());
		int N = Integer.parseInt(sc.nextLine());
		int area = 0;
		for (int i=0; i<N; i++) {
		    String[] slice = sc.nextLine().split(" ");
		    int w = Integer.parseInt(slice[0]);
		    int l = Integer.parseInt(slice[1]);
		    area = area + w * l;
		}
		int L = area / W;
		System.out.println(L);
	}
}
