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
        Bank bank = new Bank();
        BagelShop store = new BagelShop("Joe's Bakery", 999, 2,bank);
        CreditCard card1 = new CreditCard(name, String.valueOf((int) (Math.random()*9000)+1000));
        CreditCard card2;
        System.out.println(card1);
        // call methods from your BankApp object to handle program logic

    }
}
