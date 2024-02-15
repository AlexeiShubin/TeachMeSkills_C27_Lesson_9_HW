package task3.creditCard;

/*
class "belcard" with an object and information about it
 */
import task3.constant.ICurrencyTransferFee;
import task3.constant.ILimit;

public class BelCard extends CreditCard {

    public BelCard(String cardNumber, short cvs, double sumOnCard, String id) {
        super(cardNumber, cvs, sumOnCard, id);
        this.name="BelCard";
        this.limit=ILimit.BelCard;
        this.currency= ICurrencyTransferFee.BYN;
        this.currencyStr=ICurrencyTransferFee.BYNStr;
    }
}
