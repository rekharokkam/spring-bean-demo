package com.chapter7.jdbcwithtemplates.data.entities;

import java.util.ArrayList;
import java.util.List;

public class RentalLocation
{
	private Integer rentalLocationId;
	private String name;
	private String address1;
	private String address2;
	private String city;
	private String state;
	private String postalCode;
	private List<Media> media = new ArrayList<>();
	
	/**
	 * @return the rentalLocationId
	 */
	public Integer getRentalLocationId()
	{
		return rentalLocationId;
	}
	/**
	 * @param rentalLocationId the rentalLocationId to set
	 */
	public void setRentalLocationId(Integer rentalLocationId)
	{
		this.rentalLocationId = rentalLocationId;
	}
	/**
	 * @return the name
	 */
	public String getName()
	{
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name)
	{
		this.name = name;
	}
	/**
	 * @return the address1
	 */
	public String getAddress1()
	{
		return address1;
	}
	/**
	 * @param address1 the address1 to set
	 */
	public void setAddress1(String address1)
	{
		this.address1 = address1;
	}
	/**
	 * @return the address2
	 */
	public String getAddress2()
	{
		return address2;
	}
	/**
	 * @param address2 the address2 to set
	 */
	public void setAddress2(String address2)
	{
		this.address2 = address2;
	}
	/**
	 * @return the city
	 */
	public String getCity()
	{
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city)
	{
		this.city = city;
	}
	/**
	 * @return the state
	 */
	public String getState()
	{
		return state;
	}
	/**
	 * @param state the state to set
	 */
	public void setState(String state)
	{
		this.state = state;
	}
	/**
	 * @return the postalCode
	 */
	public String getPostalCode()
	{
		return postalCode;
	}
	/**
	 * @param postalCode the postalCode to set
	 */
	public void setPostalCode(String postalCode)
	{
		this.postalCode = postalCode;
	}
	/**
	 * @return the media
	 */
	public List<Media> getMedia()
	{
		return media;
	}
	/**
	 * @param media the media to set
	 */
	public void setMedia(List<Media> media)
	{
		this.media = media;
	}
	
	@Override
	public String toString (){
		return String.format("rental location Id : %d :: name : %s :: address1 : %s :: address2 : %s :: state : %s :: city : %s :: postal_code : %s", 
				getRentalLocationId(), getName(), getAddress1(), getAddress2(), getState(), getCity(), getPostalCode());
	}
	
}
