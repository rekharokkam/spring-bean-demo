package com.chapter7.jdbcwithtemplates.data.repositories;

import java.util.List;

import com.chapter7.jdbcwithtemplates.data.entities.RentalLocation;;

public interface RentalLocationRepo extends Repo<RentalLocation>
{
	public String findNameById (Integer id);
	
	public List<RentalLocation> findByState (String state);
}
