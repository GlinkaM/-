package lb4;

import java.util.Random;

public class lb4_05_06 {
    public static void main(String[] args) {
        int arr1 [] [] = new int [5] [5];
        Random random = new Random();
        for (int i=0; i< arr1.length; i++) {
            for (int j = 0; j< arr1[i].length;j++) {
                arr1 [i] [j]=random.nextInt(9)+1;
                System.out.print( arr1 [i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        int x = random.nextInt(5), y=random.nextInt(5);
        System.out.println( "Удалить "+x+" строку и "+y+" столбец");
        System.out.println();

        for (int i=0; i< arr1.length; i++) {
            if (i==x) {
                i++;
            }
            for (int j = 0; j< arr1[i].length;j++) {
                if (j==y) {
                    j++;
                }
                System.out.print( arr1 [i][j]+" ");
            }
            System.out.println();
        }
    }
}
