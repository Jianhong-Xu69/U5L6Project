public class BankApp {
    private Bank robinDaBank;
    private BagelShop leOldeShoppe;
    private CreditCard howDoTheseWork;
    private CreditCard whyDoYouWantASecondOne;

    public BankApp (String name) {
        robinDaBank = new Bank();
        leOldeShoppe = new BagelShop("Le Olde Shoppe", 500, 2, robinDaBank);
        howDoTheseWork = new CreditCard("default", String.valueOf((int) (Math.random()*9000)+1000));
    }

    public CreditCard cardInfo() {
        return howDoTheseWork;
    }
    public Bank bankInfo() {
        return robinDaBank;
    }
    public BagelShop shopInfo() {
        return leOldeShoppe;
    }

    public String buyThings (CreditCard card, int quantity, String cardPIN) {
        if (leOldeShoppe.payForBagels(card,quantity,cardPIN)) {
            return "Successfully bought " + quantity + " bagels for " + quantity*2 + " moneys";
        } else {
            return "You stupid head put in the wrong PIN dummy! Or they ran out of stock one of the two";
        }
    }

    public String returnThings (CreditCard card, int quantity, String cardPIN) {
        if (leOldeShoppe.returnBagels(card,quantity,cardPIN)) {
            return "Successfully returned " + quantity + " bagels for " + quantity*2 + " moneys. You know maybe just sue em next time";
        } else {
            return "You stupid head put in the wrong PIN dummy!";
        }
    }

    public String payDebt (CreditCard card, int amount) {
        howDoTheseWork.reduceBalance(amount);
        return "You now owe $" + (howDoTheseWork.getBalanceOwed());
    }

    public CreditCard newOne(String name) {
        whyDoYouWantASecondOne = new CreditCard(name, String.valueOf((int) (Math.random()*9000)+1000));
        return whyDoYouWantASecondOne;
    }

    public String cardCompare() {
        if (robinDaBank.lowerBalance(howDoTheseWork,whyDoYouWantASecondOne) != null) {
            return robinDaBank.lowerBalance(howDoTheseWork,whyDoYouWantASecondOne) + "\nHas less debt";
        } else {
            return howDoTheseWork + "\n" + whyDoYouWantASecondOne + "\nThey are the same";
        }
    }

    public void depositMoneys() {
        leOldeShoppe.depositProfits();
    }

    public BagelShop checkStatus() {
        return leOldeShoppe;
    }


}