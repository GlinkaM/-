package lb2;
import  java.util.Scanner;
public class lb2_05_02 {
    public static void main(String[] args) {
       int x, y, z;
        System.out.print("Введите число");
        Scanner s = new Scanner(System.in);
        x = s.nextInt();
        y = x%5;
        z = x%7;
        if (y==2 && z==1) {
            System.out.print("Введенное число удовлетворяет критериям");
        }
        else {
            System.out.print("Введенное число не удовлетворяет критериям");
        }

} }
