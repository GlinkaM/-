package lb4;

import java.util.Random;

public class lb4_05_05 {
    public static void main(String[] args) {
        int arr1 [] [] = new int [5] [3];
        int arr2 [] [] = new int [3] [5];
        Random random = new Random();
        for (int i=0; i< arr1.length; i++) {
            for (int j = 0; j< arr1[i].length;j++) {
                arr1 [i] [j]=random.nextInt(100);
                arr2 [j] [i]= arr1 [i] [j];
                System.out.print( arr1 [i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("----------------------------------------");
        for (int i=0; i< arr2.length; i++) {
            for (int j = 0; j< arr2[i].length;j++) {
                System.out.print( arr2 [i][j]+" ");
            }
            System.out.println();
        }
    }
}
