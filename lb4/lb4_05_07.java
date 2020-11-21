package lb4;

public class lb4_05_07 {
    public static void main(String[] args) {
        int n = 6;
        int r = 0;
        int c = 0;
        int spec = 0;
        int i = 0;
        int arr [][] = new int[n][n];
        for (int z = 0; i < n * n - 1; z++) {

            for (int j = 0; j < n - spec; j++) {
                arr[r][c++] = ++i;
            }
            c--;
            ++spec;

            for (int k = 0; k < n - spec; k++) {
                arr[++r][c] = ++i;
            }

            for (int l = 0; l < n - spec; l++) {
                arr[r][--c] = ++i;
            }
            ++spec;

            for (int m = 0; m < n - spec; m++) {
                arr[--r][c] = ++i;
            }
            c++;
        }

        for (int d = 0; d < n; d++) {
            for (int s = 0; s < n; s++) {
                System.out.print(arr[d][s] + "\t");
            }
            System.out.println();
        }

    }

}


