package lb6;

public class Class4 {

    private static int y;

    static int dfacr(int x) {
        if (x == 2) {
            return 2;
        }
        else if (x==1) {
            return 1;
        }
        else {
            return x * dfacr(x - 2);
        }
    }

    static int dfac (int x) {
        y=x;
        while (y!=2 && y!=1) {
            y=y-2;
            x*=y;
        }
        return x;
    }
}


