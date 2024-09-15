//User Input using console
import java.io.Console;
public class ConsoleInput {
    public static void main(String[] args) {
        Console console = System.console();
        if(console!=null){
            System.out.print("Enter a string: ");
            String input = console.readLine();
            System.out.println("Your input is: "+input);
        }else{
            System.out.println("No console available.");
        }
    }
}
