package lb3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class lb3_05_10 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int x = id.nextInt();
        int[] arr1 = new int[x];
        Random random = new Random();
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = random.nextInt(200);
            System.out.print(" " + arr1[i]);
        }
        System.out.println(" ");
        Arrays.sort(arr1);
        for (int y = 0; y < arr1.length; y++) {
            arr1[y] = arr1[y] * -1;
        }
        Arrays.sort(arr1);
        System.out.println(" ");
        for (int y = 0; y < arr1.length; y++) {
            arr1[y] = arr1[y] * -1;
        }
        for (int z=0; z< arr1.length; z++) {
            System.out.print(" "+arr1[z]);
        }

    }
}
