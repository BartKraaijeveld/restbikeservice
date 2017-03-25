package nl.hu.iac.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import nl.hu.iac.service.ServiceProvider;
import nl.hu.iac.service.Bike;
import nl.hu.iac.service.BikeServiceImpl;

/**
 * Created by Bart on 23-3-2017.
 */
@Path("/bikes")
public class BikeRestService {

    @GET
    @Path("/")
    @Produces({MediaType.APPLICATION_JSON})
    public List<Bike> getAllBikes() {
        BikeServiceImpl bikeServiceImpl = ServiceProvider.getBikeService();
        return bikeServiceImpl.getBikes();
    }

    @PUT
    @Consumes ({MediaType.APPLICATION_JSON})
    @Produces ({MediaType.APPLICATION_JSON})
    public Bike addBike(Bike bike){
        BikeServiceImpl bikeServiceImpl = ServiceProvider.getBikeService();
        return bikeServiceImpl.addBike(bike);
    }
}
