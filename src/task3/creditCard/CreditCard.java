package task3.creditCard;

/**
 * a class that unites all card classes and has information parameters about them
 */

public abstract class CreditCard {


    public String cardNumber;
    public short cvs;
    public double sumOnCard;
    public String id;
    public short limit;
    public String name;
    public byte currency;
    public double oldBalance;
    public String currencyStr;

    public CreditCard(String cardNumber, short cvs, double sumOnCard, String id){
        this.cardNumber=cardNumber;
        this.cvs=cvs;
        this.sumOnCard=sumOnCard;
        this.id=id;
    }

}
