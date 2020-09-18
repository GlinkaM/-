import java.util.Scanner;
public class example05_11{
public static void main(String[] args) {

Scanner in = new Scanner(System.in); 


System.out.print("what_month?: "); 
String what_month= in.nextLine(); 

System.out.print("days ?: "); 
int days = in.nextInt();

System.out.printf ("In %s %s days",what_month ,days ); 

in.close();
}
}


