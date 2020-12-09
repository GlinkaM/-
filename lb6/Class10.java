package lb6;

import java.util.Arrays;

public class Class10 {

    static int [] minmax (int ...x) {
        int minmax[] = new int[2];
        Arrays.sort(x);
        minmax[0]=x[0];
        minmax[1]=x[x.length-1];
        return minmax;
    }

}
