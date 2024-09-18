//reverse a number
import java.util.Scanner;
public class ReverseNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int n = num;
        int rev = 0;
        while(n>0){
            rev = (rev*10) + (n%10);
            n = n/10;
        }
        System.out.println("Reverse of "+num+" is: "+rev);
        sc.close();
    }
}
