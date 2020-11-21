package lb5;

public class Add1 {
    private char i;

    void SetChar (char a) {
        i = a;
    }

    int CharCode (int x) {
        x = (int)i;
        return x;
    }

    void Print(){
        System.out.println("Значение поля "+i+" Код символа "+(int) i);
    }

}



