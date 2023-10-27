package Task5;

import java.util.Scanner;

public class Address {

    private String city;
    private String street;
    private String country;
    private int house;
    private int apartment;
    private int index;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getHouse() {
        return house;
    }

    public void setHouse(int house) {
        this.house = house;
    }

    public int getApartment() {
        return apartment;
    }

    public void setApartment(int apartment) {
        this.apartment = apartment;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public void showFullAddress(){

        System.out.println(

           getIndex() +"\n" + getCountry() +"\n" + getCity() +"\n"
           + getStreet()+"\n" + getHouse() +"\n" + getApartment()


        );



    }





}
