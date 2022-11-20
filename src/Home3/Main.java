package Home3;

public class Main {
    public static void main(String[] args) {
        Address a = new Address();
        a.setIndex("08092");
        a.setCountry("Ukraine") ;
        a.setCity("Bucha");
        a.setStreet(" str. Nova");
        a.setHouse(" house 8");
        a.setApartment("apartment 100");
        System.out.println("Address: " + a.getIndex()  + "; " + a.getCountry() + "; " + a.getCity()  + "; " + a.getStreet()  + "; " + a.getHouse()  + "; " + a.getApartment() + "." );

    }
}
