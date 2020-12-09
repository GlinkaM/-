package lb6;

public class Class5 {

    private static int y,z;

    static int sq (int x) {
        for (int i=0; x!=0; i++) {
            y=x;
            x--;
            y*=y;
            z+=y;
        }
        return z;
    }

    static int sqr (int x) {
        if (x==0) {
            return x;
        }
        y=x;
        y*=y;
        return y+sqr(x-1);
    }
}
