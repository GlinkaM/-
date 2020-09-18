import java.util.Scanner;
public class example05_13{
public static void main(String[] args) {
Scanner in = new Scanner(System.in); 

int x, y, z;

x = 2020;

System.out.print("Input name: "); 
String name = in.nextLine(); 

System.out.print("Year_of_birth?: "); 
int Year_of_birth = in.nextInt();

y = Year_of_birth;

z = x-y;


System.out.printf("Name:%s Age:%d", name, Year_of_birth); 

in.close();
}
}


