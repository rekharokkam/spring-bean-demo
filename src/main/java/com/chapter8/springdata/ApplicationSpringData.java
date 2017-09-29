package com.chapter8.springdata;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.chapter8.springdata.data.entities.Media;
//import com.chapter8.springdata.data.repositories.MediaRepository;
//import com.chapter8.springdata.data.repositories.RentalLocationRepository;
import com.chapter8.springdata.data.services.RentalService;

public class ApplicationSpringData
{
	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("applcation-context-spring-data-jpa.xml");
//		RentalLocationRepository repo = context.getBean(RentalLocationRepository.class);
//		
//		System.out.println("\n" + repo.findOne(6));
		
//		MediaRepository repo = context.getBean(MediaRepository.class);
//		repo.save(getMedia());
		
//		List<Media> title = repo.findByTitleLikeAndIsAvailableIsTrue("title2");
//		List<Media> title = repo.findByRating(2);
//		System.out.println(title);
		
		RentalService rentalService = context.getBean(RentalService.class);
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("\n\nPlease enter the title : ");
		List<Media> titles = rentalService.findTitle(scanner.nextLine());
		System.out.println("\n\n" + titles.size());
		if (titles.isEmpty()){
			System.out.println("No Media found with this title. Please try again");
			
		}else {
			System.out.println("Title found at the following locations");
			for (int i = 0; i < titles.size(); i ++) {
				System.out.printf("%d : %s", (i + 1), titles.get(i).getRentalLocation().getName());
			}
		
		
			System.out.println("\n\nPlease select a location");
			Media selectedMedia = titles.get(scanner.nextInt() -1);
			rentalService.rent(selectedMedia);
			
			System.out.printf("Rental of %s confirmed", selectedMedia.getTitle());
		}	
		scanner.close();
		((ClassPathXmlApplicationContext)context).close();
	}
	
	public static Media getMedia (){
		Media media = new Media ();
		media.setTitle("The Sum of all Fears");
		media.setFormat("DVD");
		media.setRating(5);
		media.setLength(220);
		
		return media;
	}
}
