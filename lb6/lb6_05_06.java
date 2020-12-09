package lb6;

import java.util.Random;

public class lb6_05_06 {
    public static void main(String[] args) {

        Random r = new Random();
        int x = r.nextInt(10);
        int size = 20; //r.nextInt(20);
        int [] arr = new int[size];
        System.out.print("Передаваемый массив: ");
        for (int i =0; i<arr.length; i++) {
            arr[i]= r.nextInt(100);
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Элементов в массиве "+arr.length);
        System.out.println("Целое число "+x);

        System.out.println(Class6.newarr(arr,x));













    }
}
