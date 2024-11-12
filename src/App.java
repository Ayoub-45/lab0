
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Value 1 : ");
        int n1 = sc.nextInt();
        System.out.print("Value 2: ");
        int n2 = sc.nextInt();
        float sum = n1 + n2;
        System.out.println("The result is: " + sum);
        System.out.print("Enter a value: ");
        int a = sc.nextInt();
        System.out.print("the double of " + a + " is " + a * 2);
    }
}
