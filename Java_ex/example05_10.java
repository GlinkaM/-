import java.util.Scanner;
public class example05_10{
public static void main(String[] args) {

Scanner in = new Scanner(System.in); 

System.out.print("day_of_the_week?: "); 
String day_the_week= in.nextLine(); 

System.out.print("what_month?: "); 
String what_month= in.nextLine(); 

System.out.print("What_number?: "); 
int What_number = in.nextInt();

System.out.printf ("Today %s %s %s",day_the_week ,What_number, what_month, what_month ); 

in.close();
}
}


