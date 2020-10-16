package lb3;


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class lb3_05_09 {
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
        System.out.print(Arrays.toString(arr1));

        System.out.println(" ");


        System.out.println("Минимальное значение в массиве " +arr1[0]);
        for (int y=0; y< arr1.length; y++ ) {
            if (arr1[y]==arr1[0]) {
                System.out.print("индекс = "+y);
            }
        }
    }
}

