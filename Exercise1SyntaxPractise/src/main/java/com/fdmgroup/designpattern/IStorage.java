package com.fdmgroup.designpattern;

import java.util.List;

public interface IStorage {
	public void create(User user);
	public User read(int id);
	public void update(User updatedUser);
	public void delete(int id);
	
	public List<User> readAll ();

}
