package lb3;

import java.util.Scanner;

public class lb3_05_03_for {
    public static void main(String[] args) {
        System.out.println("Введите число");
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int m = 0, n = 1;
        if ((x / 2) * 2 != x) x++;
        for (int y = 0; x/2 != y; y++) {
            int h = m + n;
            m = h;
            n = n + m;
            System.out.print(" " + h);
            System.out.print(" " + n);
        }
        }
    }

