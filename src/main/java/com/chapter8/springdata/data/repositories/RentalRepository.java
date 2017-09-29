package com.chapter8.springdata.data.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chapter8.springdata.data.entities.Rental;

public interface RentalRepository extends JpaRepository<Rental, Integer>
{

}
