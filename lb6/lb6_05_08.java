package lb6;

import java.util.Random;

public class lb6_05_08 {
    public static void main(String[] args) {

        Random r = new Random();
        int size = r.nextInt(20);
        int [] arr = new int[size];
        System.out.print("Передаваемый массив: ");
        for (int i =0; i<arr.length; i++) {
            arr[i]= r.nextInt(100);
            System.out.print(arr[i]+" ");
        }
        System.out.println();


        System.out.println(Class8.srednie(arr));



    }
}
