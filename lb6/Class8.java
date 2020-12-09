package lb6;

public class Class8 {

    private static double x;

    static double srednie(int[] arr) {

        for(int i=0; i< arr.length; i++) {
            x+=arr[i];
        }
        x/= arr.length;
        return x;
    }

}
