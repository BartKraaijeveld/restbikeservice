package nl.hu.iac.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Bart on 23-3-2017.
 */
public class BikeServiceImpl {
    private List<Bike> bikes = new ArrayList<Bike>();

    public void setBikes(List<Bike> bikes) {
        this.bikes = bikes;
    }

    public BikeServiceImpl(){
        bikes.add(new Bike(01, "Batavus", 400));
        bikes.add(new Bike(02, "Cortina", 600));
        bikes.add(new Bike(03, "Hema on the Road", 950));
        bikes.add(new Bike(04, "Sparta", 900));
        bikes.add(new Bike(05, "KTM", 700));
        bikes.add(new Bike(06, "SuperMegaBikePlusXXL", 2000));
    }

    public List<Bike> getBikes() {
        return bikes;
    }

    public Bike addBike(Bike bike) {
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(100);
        bike.setId(randomInt);
        if (bikes.add(bike)) {
            bikes.add(bike);
            return bike;
        } else {
            return null;
        }
    }

}
