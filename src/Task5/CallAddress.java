package Task5;

import java.util.Scanner;

public class CallAddress {
    public static void main(String[] args) {
        Address someAddress = new Address();
        Scanner enteringScan = new Scanner(System.in);
        System.out.println("Type the index");
        someAddress.setIndex(enteringScan.nextInt());
        System.out.println("Type the Country");
        someAddress.setCountry(enteringScan.next());
        System.out.println("Type the City");
        someAddress.setCity(enteringScan.next());
        System.out.println("Type the Street");
        someAddress.setStreet(enteringScan.next());
        System.out.println("Type the Street");
        someAddress.setStreet(enteringScan.nextLine());
        System.out.println("Type the house number");
        someAddress.setHouse(enteringScan.nextInt());
        System.out.println("Type the apartment number");
        someAddress.setApartment(enteringScan.nextInt());
        someAddress.showFullAddress();
    }
}
