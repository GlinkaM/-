import java.util.Scanner;
public class example05_08{
public static void main(String[] args) {

Scanner in = new Scanner(System.in); 

System.out.print("input surname: ");
String surname = in.nextLine(); 

System.out.print("input name: ");
String name = in.nextLine(); 

System.out.print("input middle_name: ");
String middle_name = in.nextLine();

System.out.printf("Hallo %s %s %s", surname, name, middle_name);  

in.close();
}
}

