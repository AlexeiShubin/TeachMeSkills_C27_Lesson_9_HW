package task3.client;

public class Client {

    public String name;

    public String surname;

    public String passportNumber;

    public int postcode;

    public String country;

    public String city;

    public String street;

    public short house;

    public short numberOfCards;

    public Client(String name, String surname, String passportNumber,  int postcode, String country, String city, String street, short house){
        this.name=name;
        this.surname=surname;
        this.passportNumber=passportNumber;
        this.postcode=postcode;
        this.country=country;
        this.city=city;
        this.street=street;
        this.house=house;
        this.numberOfCards=3;
    }

}
