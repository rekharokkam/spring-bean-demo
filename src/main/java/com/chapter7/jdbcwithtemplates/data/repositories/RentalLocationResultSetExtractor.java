package com.chapter7.jdbcwithtemplates.data.repositories;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.chapter7.jdbcwithtemplates.data.entities.Media;
import com.chapter7.jdbcwithtemplates.data.entities.RentalLocation;

public class RentalLocationResultSetExtractor implements ResultSetExtractor<List<RentalLocation>>
{
	@Override
	public List<RentalLocation> extractData(ResultSet rs) throws SQLException, DataAccessException
	{
		Map<Integer, RentalLocation> locations = new HashMap<>();
		RentalLocation location;
		
		while (rs.next()){
			Integer rentalLocationId = rs.getInt("rental_location_id");
			location = locations.get(rentalLocationId);
			
			if (location == null){ //location does not exist
				location = new RentalLocation();
				location.setRentalLocationId(rs.getInt("rl.rental_location_id"));
				location.setName(rs.getString("name"));
				location.setAddress1(rs.getString("address1"));
				location.setAddress2(rs.getString("address2"));
				location.setCity(rs.getString("city"));
				location.setState(rs.getString("state"));
				location.setPostalCode(rs.getString("postal_code"));
				
				locations.put(rentalLocationId, location);
			}
			
			Integer mediaId = rs.getInt("media_id");
			if (mediaId > 0){ //media exists
				Media media = new Media ();
				media.setMediaId(mediaId);
				media.setTitle(rs.getString("title"));
				media.setLength(rs.getInt("length"));
				media.setRating(rs.getInt("rating"));
				media.setAvailable(rs.getBoolean("is_available"));
				media.setFormat(rs.getString("format"));
				
				media.setRentalLocation(location);
				
				location.getMedia().add(media);
			}
		}
		
		return new ArrayList<RentalLocation>(locations.values());
	}
}
