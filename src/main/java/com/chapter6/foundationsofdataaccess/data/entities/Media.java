package com.chapter6.foundationsofdataaccess.data.entities;

public class Media
{
	private Integer mediaId;
	private String title;
	private String format;
	private Integer length;
	private Integer rating;
	private boolean isAvailable;
	private RentalLocation rentalLocation;
	/**
	 * @return the mediaId
	 */
	public Integer getMediaId()
	{
		return mediaId;
	}
	/**
	 * @param mediaId the mediaId to set
	 */
	public void setMediaId(Integer mediaId)
	{
		this.mediaId = mediaId;
	}
	/**
	 * @return the title
	 */
	public String getTitle()
	{
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title)
	{
		this.title = title;
	}
	/**
	 * @return the format
	 */
	public String getFormat()
	{
		return format;
	}
	/**
	 * @param format the format to set
	 */
	public void setFormat(String format)
	{
		this.format = format;
	}
	/**
	 * @return the length
	 */
	public Integer getLength()
	{
		return length;
	}
	/**
	 * @param length the length to set
	 */
	public void setLength(Integer length)
	{
		this.length = length;
	}
	/**
	 * @return the rating
	 */
	public Integer getRating()
	{
		return rating;
	}
	/**
	 * @param rating the rating to set
	 */
	public void setRating(Integer rating)
	{
		this.rating = rating;
	}
	/**
	 * @return the isAvailable
	 */
	public boolean isAvailable()
	{
		return isAvailable;
	}
	/**
	 * @param isAvailable the isAvailable to set
	 */
	public void setAvailable(boolean isAvailable)
	{
		this.isAvailable = isAvailable;
	}
	/**
	 * @return the rentalLocation
	 */
	public RentalLocation getRentalLocation()
	{
		return rentalLocation;
	}
	/**
	 * @param rentalLocation the rentalLocation to set
	 */
	public void setRentalLocation(RentalLocation rentalLocation)
	{
		this.rentalLocation = rentalLocation;
	}
	
	
}
