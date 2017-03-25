package nl.hu.iac.rest;

import junit.framework.TestCase;
import org.junit.Test;
import nl.hu.iac.service.Bike;
import nl.hu.iac.service.BikeServiceImpl;
import nl.hu.iac.service.ServiceProvider;
import static org.junit.Assert.*;

/**
 * Created by Bart on 25-3-2017.
 */
public class BikeRestServiceTest {
    @Test
    public void getAllBikes() throws Exception {
        BikeServiceImpl bikeService = ServiceProvider.getBikeService();
        TestCase.assertTrue(bikeService.getBikes() != null);{
        }
    }

    @Test
    public void addBike() throws Exception {
        BikeServiceImpl bikeService = ServiceProvider.getBikeService();
        Bike testBike = new Bike(20, "TestBrand", 700);
        TestCase.assertTrue(bikeService.addBike(testBike) != null);{
        }
    }
}