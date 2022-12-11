public class BankApp {

    public static CreditCard cardInfo(CreditCard card) {
        return card;
    }
    public static Bank bankInfo(Bank bank) {
        return bank;
    }
    public static BagelShop shopInfo(BagelShop shop) {
        return shop;
    }

    public static String buyThings (CreditCard card, BagelShop shop, int quantity, String cardPIN) {
        if (shop.payForBagels(card,quantity,cardPIN)) {
            return "Successfully bought " + quantity + " bagels for " + quantity*2 + " moneys";
        } else {
            return "You stupid head put in the wrong PIN dummy! Or they ran out of stock one of the two";
        }
    }

    public String returnThings (CreditCard card, BagelShop shop, int quantity, String cardPIN) {
        if (shop.returnBagels(card,quantity,cardPIN)) {
            return "Successfully returned " + quantity + " bagels for " + quantity*2 + " moneys. You know maybe just sue em next time";
        } else {
            return "You stupid head put in the wrong PIN dummy!";
        }
    }

    public String payDebt (CreditCard card, Bank bank, int amount) {
        card.reduceBalance(amount);
        return "You now owe $" + (card.getBalanceOwed());
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