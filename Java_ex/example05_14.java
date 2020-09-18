import java.util.Scanner;
public class example05_14{
public static void main(String[] args) {

Scanner in = new Scanner(System.in); 

int x, y, z;

x = 2020;

System.out.print("How_old_are_you ? "); 
int How_old_are_you = in.nextInt();

y = How_old_are_you;
z = x-y;

System.out.print ("Hou were born in "+z);

in.close();
}
}




