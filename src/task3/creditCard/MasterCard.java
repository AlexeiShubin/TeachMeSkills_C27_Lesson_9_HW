package task3.creditCard;

/*
 * class "MasterCard" with an object and information about it
 */

import task3.constant.ICurrencyTransferFee;
import task3.constant.ILimit;

public class MasterCard extends CreditCard {


    public MasterCard(String cardNumber, short cvs, double sumOnCard, String id) {
        super(cardNumber, cvs, sumOnCard, id);
        this.name="MasterCard";
        this.limit=ILimit.MasterCard;
        this.currency= ICurrencyTransferFee.BYN;
        this.currencyStr=ICurrencyTransferFee.BYNStr;
    }
}
