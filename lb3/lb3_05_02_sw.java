package lb3;

import java.util.Scanner;

public class lb3_05_02_sw {
    public static void main(String[] args) {
        System.out.println("День недели?");
        Scanner s = new Scanner(System.in);
        String x = s.next();
        switch (x) {
            case "Понедельник" ,"понедельник":
                System.out.println("1");
             break;
            case "Вторник" ,"вторник":
                System.out.println("2");
                break;
            case "Среда","среда" :
                System.out.println("3");
                break;
            case "Четверг","четверг" :
                System.out.println("4");
                break;
            case "Пятница" ,"пятница":
                System.out.println("5");
                break;
            case "Суббота" ,"суббота":
                System.out.println("6");
                break;
            case "Воскресение" ,"воскресение":
                System.out.println("7");
                break;
            default:  System.out.println("Такого дня нет");
        }
    }
    }

