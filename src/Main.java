import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        String name;
        String choice = "";
        Scanner user = new Scanner(System.in);
        System.out.println("What would you like your name to be?");
        name = user.nextLine();
        BankApp app = new BankApp(name);
        while (!choice.equalsIgnoreCase("Quit")) {
            System.out.println(app.cardInfo());
        }
        // call methods from your BankApp object to handle program logic

    }
}
