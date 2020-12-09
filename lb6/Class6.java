package lb6;

public class Class6 {

    static int[] newarr (int [] arr, int x) {

        if (x > arr.length) {
            int[] arrn = arr.clone();
            return arrn;
        } else {
            int [] arrp = new int [x];
            for (int i=0; i<x; i++) {
                arrp[i]=arr[i];
            }
            System.out.println(arrp);
            return arrp;
        }
    }
}




