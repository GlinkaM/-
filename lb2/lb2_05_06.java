package lb2;
import java.util.Scanner;
public class lb2_05_06 {
    public static void main(String[] args) {
        int x,z;
        String y;
        System.out.print("Введите число");
        Scanner s = new Scanner(System.in);
        x = s.nextInt();
        y = Integer.toOctalString (x);
        System.out.println(""+y);
        z = Integer.parseInt(y);
        System.out.print((z%100)/10);
    } }