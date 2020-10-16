package lb3;

import java.util.Scanner;

public class lb3_05_07 {
    public static void main(String[] args) {
        String [] arr1 = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        System.out.println("Какой массив вы желаете ?");
        Scanner s = new Scanner(System.in);
        int z=0,x = s.nextInt()*2;
        String [] arr2 = new String[x];
        for (int y=0; y<x; y=y+2) {
            arr2[z] = arr1[y];
            System.out.print(" " + arr2[z]);
            z++;
        }
        System.out.println(" ");
        for (int i=0; i< arr2.length; i++){
            System.out.print( " "+arr2[i]);
        }
    }
}

