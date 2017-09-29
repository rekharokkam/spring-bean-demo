package com.chapter7.jdbcwithtemplates.data.entities;

import java.util.Date;

public class Rental
{
	private Integer rentalId;
	private Date pickupDate;
	private Date returnDate;
	private Media media;
	private RentalLocation pickupLocation;
	private RentalLocation returnLcation;
	/**
	 * @return the rentalId
	 */
	public Integer getRentalId()
	{
		return rentalId;
	}
	/**
	 * @param rentalId the rentalId to set
	 */
	public void setRentalId(Integer rentalId)
	{
		this.rentalId = rentalId;
	}
	/**
	 * @return the pickupDate
	 */
	public Date getPickupDate()
	{
		return pickupDate;
	}
	/**
	 * @param pickupDate the pickupDate to set
	 */
	public void setPickupDate(Date pickupDate)
	{
		this.pickupDate = pickupDate;
	}
	/**
	 * @return the returnDate
	 */
	public Date getReturnDate()
	{
		return returnDate;
	}
	/**
	 * @param returnDate the returnDate to set
	 */
	public void setReturnDate(Date returnDate)
	{
		this.returnDate = returnDate;
	}
	/**
	 * @return the media
	 */
	public Media getMedia()
	{
		return media;
	}
	/**
	 * @param media the media to set
	 */
	public void setMedia(Media media)
	{
		this.media = media;
	}
	/**
	 * @return the pickupLocation
	 */
	public RentalLocation getPickupLocation()
	{
		return pickupLocation;
	}
	/**
	 * @param pickupLocation the pickupLocation to set
	 */
	public void setPickupLocation(RentalLocation pickupLocation)
	{
		this.pickupLocation = pickupLocation;
	}
	/**
	 * @return the returnLcation
	 */
	public RentalLocation getReturnLcation()
	{
		return returnLcation;
	}
	/**
	 * @param returnLcation the returnLcation to set
	 */
	public void setReturnLcation(RentalLocation returnLcation)
	{
		this.returnLcation = returnLcation;
	}
	
	
}
