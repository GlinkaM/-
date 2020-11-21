package lb4;

public class lb4_05_03 {
    public static void main(String[] args) {
        int[][] arr = new int[5][10];
        for (int i=0; i< arr.length; i++) {
            for (int j = 0; j< arr[i].length;j++) {
                arr [i] [j]=2;
                System.out.print( arr [i][j]);
            }
            System.out.println();
        }
    }
}

