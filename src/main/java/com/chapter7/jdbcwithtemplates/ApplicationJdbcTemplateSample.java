package com.chapter7.jdbcwithtemplates;

//import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.chapter7.jdbcwithtemplates.data.entities.RentalLocation;
import com.chapter7.jdbcwithtemplates.data.repositories.RentalLocationRepo;

public class ApplicationJdbcTemplateSample
{
	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("applcation-context-jdbc-with-templates.xml");
		RentalLocationRepo rentalLocationRepo = context.getBean(RentalLocationRepo.class);
		
		//FindByName - Read Operation
//		System.out.println(rentalLocationRepo.findNameById(2));
		
		//FindById - Read Operation - Single Object
//		RentalLocation rentalLocation = rentalLocationRepo.findById(2);
//		System.out.println(rentalLocation.getName());
//		System.out.println(rentalLocation.getRentalLocationId());
		
		//FindByState - Read Operation - List of Objects
//		List<RentalLocation> locations = rentalLocationRepo.findByState("State");
//		System.out.println(locations.size());
//		locations.stream().forEach(System.out::println);
		
		//Create Operation
//		RentalLocation location = getLocation();
//		rentalLocationRepo.insert(location);
//		
//		System.out.println(location.getRentalLocationId());
		
		
		//Update Operation
		rentalLocationRepo.update(getLocation());
		
		((ClassPathXmlApplicationContext)context).close();
	}
	
	public static RentalLocation getLocation (){
		RentalLocation location = new RentalLocation();
		location.setRentalLocationId(2);
		location.setName("Walmart");
		location.setAddress1("Address1");
		location.setAddress2("Address2");
		location.setCity("City");
		location.setState("CA");
		location.setPostalCode("94576");
		
		return location;
	}
}
