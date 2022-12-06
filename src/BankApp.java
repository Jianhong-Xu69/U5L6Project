public class BankApp {

    private Bank robinDaBank;
    private BagelShop leOldeShoppe;
    private CreditCard howDoTheseWork;

    public BankApp (String name) {
        robinDaBank = new Bank();
        leOldeShoppe = new BagelShop("Le Olde Shoppe", 500, 2, robinDaBank);
        howDoTheseWork = new CreditCard(name, String.valueOf((int) (Math.random()*9000)+1000));
    }

    public String buyThings (CreditCard card, int quantity, String cardPIN) {
        if (leOldeShoppe.payForBagels(card,quantity,cardPIN)) {
            return "Successfully bought " + quantity + " bagels for " + quantity*2 + " moneys";
        } else {
            return "You stupid poo head put in the wrong PIN dummy! Or they ran out of stock one of the two";
        }
    }


}