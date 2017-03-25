package nl.hu.iac.service;


public class ServiceProvider {
	private static BikeServiceImpl bikeService = new BikeServiceImpl();
	public static BikeServiceImpl getBikeService(){return bikeService;}
}