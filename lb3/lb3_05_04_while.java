package lb3;

import java.util.Scanner;

public class lb3_05_04_while {
    public static void main(String[] args) {
        System.out.println("Введите первое число");
        Scanner one = new Scanner(System.in);
        int x = one.nextInt();
        System.out.println("Введите второе число");
        Scanner two = new Scanner(System.in);
        int y = two.nextInt();

        if (x < y) {
            System.out.print(" "+x);
            while (x != y) {
                x++;
                System.out.print(" " + x);
            }
        }

        if (y < x) {
            System.out.print(" "+y);
            while (y != x) {
                y++;
                System.out.print(" " + y);
            }
        }
    }
}

