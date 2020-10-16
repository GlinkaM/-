package lb3;

import java.util.Scanner;

public class lb3_05_02_if {
    public static void main(String[] args) {
        System.out.println("День недели?");
        Scanner s = new Scanner(System.in);
        String x = s.next();
       if (x.equals("Понедельник") || x.equals("понедельник")) {
            System.out.println("1"); }
       else if (x.equals("Вторник") || x.equals("вторник")) {
                System.out.println("2"); }
       else if (x.equals("Среда") || x.equals("среда")) {
                System.out.println("3"); }
       else if (x.equals("Четверг") || x.equals("четверг")) {
                System.out.println("4"); }
       else if (x.equals("Пятница") || x.equals("пятница")) {
                System.out.println("5"); }
       else if (x.equals("Суббота") || x.equals("суббота")) {
                System.out.println("6"); }
       else if (x.equals("Воскресение") || x.equals("воскресение")) {
                System.out.println("7"); }
       else { System.out.println("Такого дня нет");
       }
    }
}
