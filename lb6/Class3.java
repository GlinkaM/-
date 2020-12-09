package lb6;

import java.util.Arrays;

public class Class3 {

    static double sum;

    static void min (int...x) {
        Arrays.sort(x);
        System.out.println("Минимальное значение "+ x[0]);
    }

    static void max (int...x) {
        Arrays.sort(x);
        System.out.println("Максимальное значение "+x[x.length-1]);
    }

    static void sr (int...x) {
        sum =0;
        for (int i=0; i< x.length;i++) {
            sum +=x[i];
        }
        System.out.println("Среднее значение "+sum/x.length);
    }

}







