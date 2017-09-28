package com.chapter6.foundationsofdataaccess.repositories;

public interface Repo <T>
{
	public void insert (T entity);
	
	public void update (T entity);
	
	public void delete (T entity);
	
	public T findById ();
}
