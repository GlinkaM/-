package lb6;

public class Class2 {
    private static int x=0;

    static void value () {
        System.out.println("Статическое поле = "+x);
        x +=1;
        System.out.println("Статическое поле = "+x);
    }
}
