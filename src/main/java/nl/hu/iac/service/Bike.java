package nl.hu.iac.service;

/**
 * Created by Bart on 23-3-2017.
 */

public class Bike {
    int id;
    String brand;
    int price;

    public Bike(){super();}

    public Bike(int id, String brand, int price ){
        this.id = id;
        this.brand = brand;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public int getPrice() {
        return price;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
