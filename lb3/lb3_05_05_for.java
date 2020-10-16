package lb3;

import java.util.Scanner;

public class lb3_05_05_for {
    public static void main(String[] args) {
        System.out.println("Сколько ?");
        Scanner s = new Scanner(System.in);
        int y = 4, h = 0, z = 0, x = s.nextInt();
        for (; x != z; y++) {
            if (y % 5 == 2 || y%3==1) {
                if (y != 4) System.out.print("+");
                System.out.print("" + y);
                h = h + y;
                z++;
                if (x == z) {
                    System.out.println("=" + h);
                }
            }
        }
    }
}