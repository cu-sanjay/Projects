import java.util.ArrayList;
import java.util.Scanner;

public class Exp5 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        ArrayList<Character> b = new ArrayList<>();
        ArrayList<Integer> c = new ArrayList<>();

        int d = 0;
        while (d < 4) {
            System.out.println("enter card : ");
            char e = a.next().charAt(0);
            int f = a.nextInt();

            if (!b.contains(e)) {
                b.add(e);
                c.add(f);
                d++;
            }
        }

        System.out.println("first card for every symbol - ");
        for (int g = 0; g < b.size(); g++) {
            System.out.println(b.get(g) + " " + c.get(g));
        }
    }
}
