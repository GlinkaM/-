import java.util.Scanner;
public class example05_16{
public static void main(String[] args) {
Scanner in = new Scanner(System.in); 

int x, y, z, c, n;


System.out.print("Enter_the_number "); 
int Enter_the_number = in.nextInt();

x = Enter_the_number ;

y=x-1;

z=x+1;

c= x+y+z;

n=c*c;

System.out.print(" "+y);
System.out.print(" "+x);
System.out.print(" "+z);
System.out.print(" "+n);

in.close();
}
}




