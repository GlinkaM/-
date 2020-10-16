package lb3;

import java.util.Scanner;

public class lb3_05_06 {

    public static void main(String[] args) {
        System.out.println("Размер массива ?");
        int i=0, z = 0, y = 0, x=0;
        Scanner s = new Scanner(System.in);
        if (s.hasNextInt()) {
            x = s.nextInt();
        }
        else {
            System.out.println("Еще раз");
        }
        int[] arr = new int[x];
        while (y < arr.length) {
            z++;
            if (z % 5 == 2) {
                    arr[i] = z;
                    System.out.print(" "+arr[i]);
                    y++;
                    i++;
            }
        }
    }
}

