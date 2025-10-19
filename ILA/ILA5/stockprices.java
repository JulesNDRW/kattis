import java.util.*;
import java.io.*;

public class stockprices {
    public static class Pair implements Comparable<Pair> {
        //x is price, y is count
        public int x;
        public int y;
        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
        @Override
        public int compareTo(Pair o) {
            return Math.abs(this.x) - Math.abs(o.x);
        }
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String a; String b; String c = "-";
        //each set
        for (int i=0; i<n; i++) {
            int k = Integer.parseInt(br.readLine());
            PriorityQueue<Pair> pqSell = new PriorityQueue<>(); //min heap
            PriorityQueue<Pair> pqBuy = new PriorityQueue<>(Comparator.reverseOrder()); //max heap
            a = "-";
            b = "-";
            c = "-";
            for (int j=0; j<k; j++) {
                //order_type x shares at y
                String[] input = br.readLine().split(" ");
                String cmd = input[0];
                int count = Integer.parseInt(input[1]);
                int cost = Integer.parseInt(input[4]);
                Pair pair = new Pair(cost, count);
                // pq adding
                if (cmd.equals("sell")) pqSell.add(pair);
                else if (cmd.equals("buy")) pqBuy.add(pair);

                while (!pqBuy.isEmpty() && !pqSell.isEmpty()) { //while both not empty
                    int buyPrice = pqBuy.peek().x;
                    int sellPrice = pqSell.peek().x;
                    //if a transaction can go through, handle
                    if (buyPrice >= sellPrice) {
                        c = String.valueOf(sellPrice);
                        int transAmountAvail = pqSell.peek().y;
                        int buyingAmountAvail = pqBuy.peek().y;
                        if (transAmountAvail == buyingAmountAvail) {
                            pqBuy.poll();
                            pqSell.poll();
                        } else if (transAmountAvail < buyingAmountAvail) {
                            int newAmt = buyingAmountAvail - transAmountAvail;
                            pqSell.poll();
                            pqBuy.poll();
                            pqBuy.add(new Pair(buyPrice, newAmt));
                        } else {
                            int newAmt = transAmountAvail - buyingAmountAvail;
                            pqSell.poll();
                            pqBuy.poll();
                            pqSell.add(new Pair(sellPrice, newAmt));
                        }
                    }
                    //if the transaction cant go through
                    else {
                        break;
                    }
                }
                if (pqSell.isEmpty()) a="-";
                else a = String.valueOf(pqSell.peek().x);
                if (pqBuy.isEmpty()) b="-";
                else b = String.valueOf(pqBuy.peek().x);


                System.out.println(a + " " + b + " " + c);
            }
        }
    }
}
