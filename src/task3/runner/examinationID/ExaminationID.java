package task3.runner.examinationID;

/*
Class examination with methods to check entered IDs,
transaction limits, correctness of the entered transfer amount and currency
 */

import task3.constant.ICurrencyTransferFee;
import task3.creditCard.CreditCard;

import java.util.Objects;

public class ExaminationID {
    
    public static boolean examination(String id, CreditCard[] creditCard) {
        boolean examination = false;
        for (CreditCard card : creditCard) {
            if (Objects.equals(card.id, id)) {
                examination = true;
                break;
            }

        }
        if(!examination){
            System.out.println("not correct id");
        }
        return !examination;
    }

    public static boolean examination1(String id1, String id2){
        boolean examination=true;
        if(id1.equals(id2)){
            examination=false;
            System.out.println("translation is not possible");
        }
        return examination;
    }

    public static boolean examinationLimit(CreditCard creditCard, double sum){
       if(sum>creditCard.limit){
           System.out.println("transfer restriction violated");
           return false;
       }else{
           return true;
       }
    }

    public static byte currencyOnCard(CreditCard creditCard1, CreditCard creditCard2){
        byte currencyOnCardCode=0;
        if(creditCard1.currency== ICurrencyTransferFee.USD&&creditCard2.currency==ICurrencyTransferFee.BYN){
            currencyOnCardCode=1;
            //USD in BYN
        } else if (creditCard1.currency==ICurrencyTransferFee.BYN&&creditCard2.currency==ICurrencyTransferFee.USD) {
            currencyOnCardCode=2;
            //BYN in USD
        }
        return currencyOnCardCode;
    }

    public static boolean examinationSum(short sum){
        boolean examinationSum=true;
        if (sum<1||sum>32000){
            System.out.println("incorrect amount to transfer");
            examinationSum=false;
        }
        return examinationSum;
    }
}
