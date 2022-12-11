import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        String name;
        String choice = "";
        int input = 0;
        Scanner user = new Scanner(System.in);
        System.out.println("What would you like your name to be?");
        name = user.nextLine();
        Bank bank = new Bank();
        BagelShop store = new BagelShop("Joe's Bakery", 999, 2,bank);
        CreditCard card1 = new CreditCard(name, String.valueOf((int) (Math.random()*9000)+1000));
        CreditCard card2;
        boolean secondCard = false;
        System.out.println(card1);
        System.out.println("What would you like to do?\n(A) Buy Bagels\n(B) Return Bagels\n(C) Pay Debt\n(D) Open another card\n(E) Compare card balances\n(F) Deposit Earnings\n(G) Check Store\nor type QUIT to quit");
        choice = user.nextLine();
        boolean end = false;
        while (!end) {
            if (choice.equalsIgnoreCase("a") || choice.equalsIgnoreCase("b") || choice.equalsIgnoreCase("c") || choice.equalsIgnoreCase("d") || choice.equalsIgnoreCase("e") || choice.equalsIgnoreCase("f") || choice.equalsIgnoreCase("g")) {
                if (choice.equalsIgnoreCase("a")) {
                    System.out.println("How many bagels do you want to buy?");
                    input = user.nextInt();
                    if (!secondCard) {
                        System.out.println("Please enter your PIN number");
                        choice = user.nextLine();
                        System.out.println(BankApp.buyThings(card1, store, input, choice));
                    } else {
                        System.out.println("What card do you want to use? (1 or 2)");
                        choice = user.nextLine();
                        if (choice.equalsIgnoreCase("1")) {
                            System.out.println("Please enter your PIN number");
                            choice = user.nextLine();
                            System.out.println(BankApp.buyThings(card1, store, input, choice));
                        } else if (choice.equalsIgnoreCase("2")) {
                            System.out.println("Please enter your PIN number");
                            choice = user.nextLine();
                            System.out.println(BankApp.buyThings(card2, store, input, choice));
                        }
                    }
                }
                else if (choice.equalsIgnoreCase("b")) {
                    HalflingSetup();
                }
                else if (choice.equalsIgnoreCase("c")) {
                    SkeletonSetup();
                }
                else if (choice.equalsIgnoreCase("d")) {
                    GhoulSetup();
                }
                else if (choice.equalsIgnoreCase("e")) {
                    ElharithlaanSetup();
                }
                else if (choice.equalsIgnoreCase("f")) {
                    AnalaanSetup();
                }
                else if (choice.equalsIgnoreCase("g")) {
                    EntaariSetup();
                }
                else if (choice.equalsIgnoreCase("h")) {
                    StonepeakSetup();
                }
            } else if (choice.equalsIgnoreCase("QUIT")) {
                end = true;
            } else {
                System.out.println("Have you tried reading the instructions?");
            }
            System.out.println("What would you like to do?\n(A) Buy Bagels\n(B) Return Bagels\n(C) Pay Debt\n(D) Open another card\n(E) Compare card balances\n(F) Deposit Earnings\n(G) Check Store\nor type QUIT to quit");
            choice = user.nextLine();
        }
        // call methods from your BankApp object to handle program logic

    }
}
