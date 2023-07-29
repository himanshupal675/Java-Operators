import java.util.Scanner;

import javax.annotation.processing.SupportedOptions;

public class ans1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x =sc.nextInt();
        System.out.println((((x+8)/3)%5)*5);
    }
}
