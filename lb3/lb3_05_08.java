package lb3;

public class lb3_05_08 {
    public static void main(String[] args) {
        String[] arr1 = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        String[] arr2 = new String[14];
        for (int i = 0; i < arr2.length; i++) {
            if (i ==0 || i==4 || i==8 || i==12) {
                System.out.print("");
            }
            else {
                arr2[i] = arr1[i];
                System.out.print(" "+arr2[i]);
                }
            }
        }
    }
