package task3.runner;

import task3.client.Client;
import task3.creditCard.BelCard;
import task3.creditCard.CreditCard;
import task3.creditCard.MasterCard;
import task3.creditCard.VisaCard;
import task3.runner.examinationID.ExaminationID;
import task3.transfer.Transfer;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        Client client1=new Client("Artem", "Ivanov", "MP9076876", 220657, "Belarus", "Minsk", "Mirnaya", (short) 456);
        MasterCard creditCard1=new MasterCard("453-4436", (short) 647, 7543.56, "C1");
        VisaCard creditCard2=new VisaCard("523-4567", (short) 893, 1253.93, "C2");
        BelCard creditCard3=new BelCard("634-2564", (short) 395, 966.67, "C3");

        CreditCard[]cards={creditCard1, creditCard2, creditCard3} ;
        System.out.print("enter a word \"info\" to get information " +
                "or the word \"skip\" to skip receiving information: ");
        String infoOrSkip= scanner.next();

        if(infoOrSkip.equals("info")){
            System.out.println();
            System.out.println("Name: "+client1.name+"\nSurname: "+client1.surname+
                    "\nPassport Number: "+client1.passportNumber+
                    "\nPostcode: "+ client1.postcode+"\nCountry: "+ client1.country+
                    "\nCity: "+ client1.city+"\nStreet: "+ client1.street+
                    "\nHouse: "+ client1.house);
        } else if (infoOrSkip.equals("skip")) {
            System.out.println("from which card is the transfer made?");
            String idFrom= scanner.next();
            if (ExaminationID.examination(idFrom, cards)){
                System.exit(1);
            }
            System.out.println("to which card is the transfer made?");
            String idTo= scanner.next();
            if(ExaminationID.examination(idTo, cards))
                System.exit(1);
            if(!ExaminationID.examination1(idTo, idFrom)){
                System.exit(1);
            }
            System.out.println("enter sum for transfer: ");
            short sum= scanner.nextShort();
            if(!ExaminationID.examinationSum(sum)){
                System.exit(1);
            }
            Transfer.informationOutput(idFrom, idTo, cards, sum, client1);
        }else{
            System.out.println("Invalid word entered");
        }


    }
}
