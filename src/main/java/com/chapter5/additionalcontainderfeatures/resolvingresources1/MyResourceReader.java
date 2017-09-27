package com.chapter5.additionalcontainderfeatures.resolvingresources1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

@Component
public class MyResourceReader
{
	@Autowired
//	@Value ("https://www.avenuecode.com/")
//	@Value ("classpath:test.txt")//Reading file from classpath
	@Value ("file:/Users/ac-rekharokkam/Documents/Rekha/workspace/spring-bean-demo/src/main/resources/test.txt")
	private Resource resource;
	
	public void print (){
		System.out.format("Resource class simple Name : %s :: resource class full name : %s", resource.getClass().getSimpleName(), resource.getClass().getName());
		System.out.println("\n");
		try{
			BufferedReader bufReader = new BufferedReader(new InputStreamReader(resource.getInputStream()));
			for (String line = bufReader.readLine(); line != null; line = bufReader.readLine()){
				System.out.println(line);
			}
			
			bufReader.close();
		}catch (IOException ioException){
			ioException.printStackTrace(System.out);
		}
	}
}
