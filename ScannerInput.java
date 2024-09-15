//User Input using Scanner
import java.util.Scanner;
public class ScannerInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String input = sc.nextLine();

        System.out.println("Your name is: "+input);
        sc.close();
    }
}
