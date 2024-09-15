//Sum of Two numbers
import java.util.Scanner;
public class SumOfTwoNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int n1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int n2 = sc.nextInt();

        int sum = n1+n2;
        System.out.println("Sum of given two numbers is: "+sum);
        sc.close();
    }
}
