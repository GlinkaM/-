package lb5;

public class Add6 {
    private int max, min;
    Add6(int x, int y) {
        this.SetMM(x,y);
    }



    void SetMM (int x, int y) {
        max=Math.max(x,y);
        min=Math.min(x,y);
    }

    void SetMM (int z) {
        this.min = Math.min(this.min, z);
        this.max = Math.max(this.max, z);
    }

    void print () {
        System.out.println("Max=" + max + " Min="+min);
    }
}
