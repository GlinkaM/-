package lb4;

import java.util.Scanner;

public class lb4_05_08 {
    public static void main(String[] args) {
        System.out.print("Введите текст для шифрования ");
        Scanner s = new Scanner(System.in);
        String text = s.nextLine();
        System.out.print("Введите ключ ");
        int key = s.nextInt();

        char [] ArrayChar = text.toCharArray();
        long[] ArrayInt = new long[ArrayChar.length];
        char[] ArrayCharNew = new char[ArrayChar.length];

        for (int i = 0; i< ArrayChar.length; i++) {
            ArrayInt[i] = ArrayChar[i] + key;
            ArrayCharNew[i] = (char)ArrayInt[i];
        }

        text = new String (ArrayCharNew);
        System.out.println("Текст после преобразования: "+text);

        System.out.println("Выполнить обратное преобразование? (Yes/No)");
        String Answer;
        do {
            Scanner o = new Scanner(System.in);
            Answer = o.nextLine();
            if (!Answer.equalsIgnoreCase("Yes" ) && !Answer.equalsIgnoreCase("No" )) {
                System.out.println("Введите корректный ответ ");
            }
        } while (!Answer.equalsIgnoreCase("Yes" ) && !Answer.equalsIgnoreCase("No" ) );

        if (Answer.equalsIgnoreCase("Yes")) {
            for (int i = 0; i < ArrayCharNew.length; i++) {
                ArrayInt[i] = ArrayCharNew[i] - key;
                ArrayCharNew[i] = ArrayChar[i];
            }
            text = new String(ArrayChar);
            System.out.println(text);
            }
        else {
            System.out.println("До свидания!");
        }
    }
}
