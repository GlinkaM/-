import java.util.Scanner;

class example05_18 {

static double a=2, b=2, c;

private static double pow() {
    return Math.exp(b*Math.log(a));
}

private static double hyp() {
    return Math.sqrt(a*a + b*b);
}

public static void main(String[] args) {

System.out.println("katet a = " + a);
System.out.println("katet b = " + b);
System.out.println("hypotenuse = " + hyp());

}}