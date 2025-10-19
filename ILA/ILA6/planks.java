import java.util.*;
import java.io.*;

public class planks {
    public static class Plank implements Comparable<Plank> {
        public int ID;
        public int weight;
        public int length;
        public Plank(int x, int y, int ID) {
            this.weight = x;
            this.length = y;
            this.ID = ID;
        }
        @Override
        public int compareTo(Plank o) {
            if (this.length != o.length) {
                return Integer.compare(this.length, o.length);
            }
            if (this.weight != o.weight) { //length is same
                return Integer.compare(o.weight, this.weight);
            }
            //same w and l
            return this.ID - o.ID;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int Q = Integer.parseInt(br.readLine());
        TreeSet<Plank> tm = new TreeSet<>();
        int weight; int length; int X;
        Plank A; Plank B;

        for (int i=0;i<Q;i++) {
            String[] line = br.readLine().split(" ");
            String cmd = line[0];

            if (cmd.equals("a")) { //adding
                weight = Integer.parseInt(line[1]);
                length = Integer.parseInt(line[2]);
                Plank p = new Plank(weight, length, i);
                tm.add(p);
            } else { //computing
                X = Integer.parseInt(line[1]);
                A = tm.floor(new Plank(-1, X, 0));
                tm.remove(A);
                B = tm.ceiling(new Plank(10000, X, 0));
                tm.remove(B);
                long E = (1L + A.weight + B.weight) * (1L + Math.abs((long)A.length - (long)B.length));
                System.out.println(E);
            }
        }
    }
}
