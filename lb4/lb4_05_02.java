package lb4;

public class lb4_05_02 {
    public static void main(String[] args) {
        int size = 10;
        for (int y = 0; y <= size; y++) {
            for (int x=0; x!=y; x++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
