package lb6;

public class Class1 {
    char ch;
    String text;

    void SetSC (char ch) {
        this.ch = ch;
        System.out.println("Значения символьного поля = "+ch);
    }

    void SetSC (String text) {
        this.text = text;
        System.out.println("Значение текстового поля = "+text);
    }


    void SetSC (char [] ArrCH) {
        if (ArrCH.length == 1) {
            this.ch = ArrCH[0];
            System.out.println("Значение символьного поля после передачи массива с 1 элементом = "+ ch);
        } else {
            String str = new String(ArrCH);
            text = str;
            System.out.println("Значение текстового поля после передачи массива с 1+ элементов = "+ text);
        }
    }
}
