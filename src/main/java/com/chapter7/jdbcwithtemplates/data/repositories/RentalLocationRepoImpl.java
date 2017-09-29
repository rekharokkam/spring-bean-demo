package com.chapter7.jdbcwithtemplates.data.repositories;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.chapter7.jdbcwithtemplates.data.entities.RentalLocation;

@Repository
public class RentalLocationRepoImpl implements RentalLocationRepo
{
	private static final String SIMPLE_QUERY = "select name from rental_location where rental_location_id = ?";
	
//	private static final String LOCATION_COLUMNS = "rl.rental_location_id, name, address1, address2, city, state, postal_code";
	
	private static final String LOCATION_COLUMNS = "rental_location_id, name, address1, address2, city, state, postal_code";
	
	private static final String MEDIA_COLUMNS = "media_id, title, format, length, rating, m.rental_location_id, is_available";
	
	private static final String FIND_BY_ID_QUERY = "select " + LOCATION_COLUMNS + " from rental_location where rental_location_id = ?";
	
//	private static final String FIND_BY_STATE_QUERY = "select " + LOCATION_COLUMNS + " from rental_location where state = ?";
	private static final String FIND_BY_STATE_QUERY = "select " + LOCATION_COLUMNS + " , " + MEDIA_COLUMNS + " from rental_location rl join media m"
			+ " on rl.rental_location_id = m.rental_location_id where rl.state = ?";
	
	private static final String INSERT_STATEMENT = "insert into rental_location (" + LOCATION_COLUMNS + " ) values (null, ?, ?, ?, ?, ?, ?)";
	
	private static final String UPDATE_STATEMENT = "update rental_location set name = ?, address1 = ?, address2 = ?, city = ?, state = ?, postal_code = ?"
			+ " where rental_location_id = ?";
	
	private static final String DELETE_STATEMENT = "delete from rental_location where rental_location_id = ?";
	
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public RentalLocationRepoImpl (DataSource dataSource){
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	public void insert(RentalLocation entity)
	{
		//This is just the plain insert without any generated Primary key
//		jdbcTemplate.update(INSERT_STATEMENT, new Object[] {
//			entity.getName(),
//			entity.getAddress1(),
//			entity.getAddress2(),
//			entity.getCity(),
//			entity.getState(),
//			entity.getPostalCode()
//		});
		
		
		//This approach sets the generated primary key on the Entity Object
		KeyHolder keyHolder = new GeneratedKeyHolder();
		jdbcTemplate.update(new PreparedStatementCreator()
		{
			@Override
			public PreparedStatement createPreparedStatement(Connection conn) throws SQLException
			{
				PreparedStatement pstmt = conn.prepareStatement(INSERT_STATEMENT, Statement.RETURN_GENERATED_KEYS);
				pstmt.setString(1, entity.getName());
				pstmt.setString(2, entity.getAddress1());
				pstmt.setString(3, entity.getAddress2());
				pstmt.setString(4, entity.getCity());
				pstmt.setString(5, entity.getState());
				pstmt.setString(6, entity.getPostalCode());
				
				return pstmt;
			}
		}, keyHolder);
		
		entity.setRentalLocationId(keyHolder.getKey().intValue());
		
	}

	public void update(RentalLocation entity)
	{
		jdbcTemplate.update(UPDATE_STATEMENT, new Object[] {
				entity.getName(),
				entity.getAddress1(),
				entity.getAddress2(),
				entity.getCity(),
				entity.getState(),
				entity.getPostalCode(),
				entity.getRentalLocationId ()
		});
	}

	public void delete(RentalLocation entity)
	{
		// TODO Auto-generated method stub

	}

	public static class RentalLocationRowMapper implements RowMapper<RentalLocation>{

		public RentalLocation mapRow(ResultSet rs, int arg1) throws SQLException
		{
			RentalLocation rentalLocation = new RentalLocation();
			rentalLocation.setRentalLocationId(rs.getInt("rental_location_id"));
			rentalLocation.setName(rs.getString("name"));
			rentalLocation.setAddress1(rs.getString("address1"));
			rentalLocation.setAddress2(rs.getString("address2"));
			rentalLocation.setCity(rs.getString("city"));
			rentalLocation.setState(rs.getString("state"));
			rentalLocation.setPostalCode(rs.getString("postal_code"));
			return rentalLocation;
		}
	}
	
	public RentalLocation findById(Integer id)
	{
		return jdbcTemplate.queryForObject(FIND_BY_ID_QUERY, new Object[] {id}, new RentalLocationRowMapper());
	}

	public String findNameById(Integer id)
	{
		return jdbcTemplate.queryForObject(SIMPLE_QUERY, new Object[] {id}, String.class);
	}
	
	public List<RentalLocation> findByState (String state){
//		return jdbcTemplate.query(FIND_BY_STATE_QUERY, new Object[] {state}, new RentalLocationRowMapper ());
		
		return jdbcTemplate.query(FIND_BY_STATE_QUERY, new Object[] {state}, new RentalLocationResultSetExtractor ());
	}
}
