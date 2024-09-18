//check armstrong number
import java.util.Scanner;
public class ArmstrongNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int n = num;
        int product = 0;
        while(n>0){
            int r = n%10;
            product += r*r*r;
            n = n/10;
        }
        if(product==num) System.out.println(num+" is Armstrong number.");
        else System.out.println(num+" is not an Armstrong number.");
        sc.close();
    }
}
