import java.util.Scanner;
public class example05_17{
public static void main(String[] args) {
Scanner in = new Scanner(System.in); 

int x, y, z, n;


System.out.print("First_number ="); 
int First_number = in.nextInt();


System.out.print("Second_number ="); 
int Second_number = in.nextInt();

x = First_number;
y = Second_number;


z = x+y;

n=x-y;

System.out.println("The sum of the numbers entered is "+z);
System.out.println("The difference between the numbers entered is "+n);

in.close();
}
}




