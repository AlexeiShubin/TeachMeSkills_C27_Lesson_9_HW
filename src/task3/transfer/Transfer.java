package task3.transfer;

/*
Class Transfer with methods transferring from card to card
and displaying translation information on the screen
 */


import task3.client.Client;
import task3.constant.ICommission;
import task3.constant.ICurrencyTransferFee;
import task3.creditCard.CreditCard;
import task3.runner.examinationID.ExaminationID;

import java.text.DecimalFormat;

public class Transfer {
    private static void transfer(CreditCard cardFrom, CreditCard cardTo, double sum){
        cardFrom.oldBalance=cardFrom.sumOnCard;
        cardTo.oldBalance=cardTo.sumOnCard;
        if(cardFrom.sumOnCard<sum){
            System.out.println("insufficient funds");
        }else{
            byte currencyCode= ExaminationID.currencyOnCard(cardFrom, cardTo);
            if(currencyCode==0){
                cardFrom.sumOnCard-=sum;
                sum-= ICommission.commission;
                cardTo.sumOnCard+=sum;
            } else if (currencyCode==1) {
                cardFrom.sumOnCard-=sum;
                sum*= ICurrencyTransferFee.USD_BYN;
                sum-= ICommission.commission;
                cardTo.sumOnCard+=sum;
            } else if (currencyCode==2) {
                cardFrom.sumOnCard-=sum;
                sum/= ICurrencyTransferFee.USD_BYN;
                sum-= ICommission.commission;
                cardTo.sumOnCard+=sum;
            }
        }

    }

    public static void informationOutput(String idFrom, String idTo, CreditCard[]cards, short sum, Client client){
        DecimalFormat format=new DecimalFormat("#.##");
        for (CreditCard card : cards) {
            if (idFrom.equals(card.id)) {
                for (CreditCard creditCard : cards) {
                    if (idTo.equals(creditCard.id)) {
                        if(ExaminationID.examinationLimit(card, sum)){
                            Transfer.transfer(card, creditCard, sum);
                            System.out.println(client.surname + " "+client.name);
                            System.out.println("Client has "+client.numberOfCards+ " cards");
                            System.out.println("Card one: "+ card.getClass()+"balance one: "+ format.format(card.oldBalance) +" "+card.currencyStr+"\n balance two: "+ format.format(card.sumOnCard)+" "+card.currencyStr);
                            System.out.println("Card two: "+ creditCard.getClass()+"balance two: "+format.format(creditCard.oldBalance)+" "+creditCard.currencyStr+"\n balance two: "+ format.format(creditCard.sumOnCard)+" "+creditCard.currencyStr);
                            System.out.println("commission: "+ sum/ICommission.commission);
                        }else{
                            System.exit(1);
                        }

                    }
                }
            }
        }
    }
}
