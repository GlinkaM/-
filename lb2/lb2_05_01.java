package lb2;

import java.util.Scanner;

 class lb2_05_01 {
    public static void main(String[] args) {
        System.out.print("Введите число");
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        if ((x/3)*3==x) {
            System.out.print("Введенное число делится на 3");
        }
        else {
            System.out.print("Введенное число не делится на 3");
        } } }
