package task3.creditCard;

/*
class "visaCard" with an object and information about it
 */

import task3.constant.ICurrencyTransferFee;
import task3.constant.ILimit;

public class VisaCard extends CreditCard {

    public VisaCard(String cardNumber, short cvs, double sumOnCard, String id) {
        super(cardNumber, cvs, sumOnCard, id);
        this.name="VisaCard";
        this.limit= ILimit.VisaCard;
        this.currency= ICurrencyTransferFee.USD;
        this.currencyStr=ICurrencyTransferFee.USDStr;
    }
}
