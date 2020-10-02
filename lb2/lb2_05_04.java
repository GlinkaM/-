package lb2;
import  java.util.Scanner;
public class lb2_05_04 {
    public static void main(String[] args) {
        int x;
        System.out.print("Введите число");
        Scanner s = new Scanner(System.in);
        x = s.nextInt();

        if ( x>=5 && x<=10) {
            System.out.print("Введенное число удовлетворяет критериям");
        }
        else {
            System.out.print("Введенное число не удовлетворяет критериям");
        }

    } }

