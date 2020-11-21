package lb5;

public class Add5 {
    private int x;

    Add5(int x) {
        this.SetX(x);
    }

    void SetX (int x) {
        this.x=x;
        if (x>=100) {
            x=100;
        }
        System.out.println(x);
    }

    void SetX () {
        this.x=0;
    }

    void print () {
        System.out.println(x);
    }


}

