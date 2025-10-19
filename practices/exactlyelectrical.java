import java.util.*;

public class exactlyelectrical {
	public static void main(String[] args) {
	    //this is just getting the variables
		Scanner sc = new Scanner(System.in);
		String start = sc.nextLine();
		String[] ab = start.split(" ");
		int a = Integer.parseInt(ab[0]);
		int b = Integer.parseInt(ab[1]);
		String dest = sc.nextLine();
		String[] cd = dest.split(" ");
		int c = Integer.parseInt(cd[0]);
		int d = Integer.parseInt(cd[1]);
		int t = sc.nextInt();
		
		int dist = Math.abs(a-c) + Math.abs(b-d);
		if (t < dist) {
		    System.out.println("N");
		} else if (t == dist) {
		    System.out.println("Y");
		} else {
		    if ((t - dist) % 2 == 0) {
		        System.out.println("Y");
		    } else {
		        System.out.println("N");
		    }
		}
	};
}
