package lb6;

public class Class7 {

    static int[] charcode (char[] x) {
        int [] charc = new int [x.length];

        for (int i=0; i< x.length; i++) {
            charc[i]=x[i];
            System.out.print(charc[i]+" ");
        }
        return charc;
    }
}
