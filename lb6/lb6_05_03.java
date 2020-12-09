package lb6;

import java.util.Random;

public class lb6_05_03 {
    public static void main(String[] args) {

        Random r = new Random();
        int x = r.nextInt(20);

        int [] arr = new int[x];
        System.out.print("Передаваемый массив: ");
        for (int i =0; i<arr.length; i++) {
            arr[i]= r.nextInt(100);
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        // Передача случайно сгенерированного массива
        System.out.println();
        Class3.min(arr);
        Class3.max(arr);
        Class3.sr(arr);

        // Передача произвольного количество целочисленных аргументов
        System.out.println();
        Class3.min(1,6,8,2,7,734,8,2,6);
        Class3.max(1,6,3,7,2,7,232,75,2,3,4);
        Class3.sr(1,2,3,4,5);

    }
}
