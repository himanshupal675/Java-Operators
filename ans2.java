import java.util.Scanner;

public class ans2 {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter First Number : ");
    int x = sc.nextInt();
    System.out.print("Enter Second Number :");
    int y = sc.nextInt();
    x=x+y;
    y=x-y;
    x=x-y;
    System.out.println(x);
    System.out.println(y);
   } 
}
