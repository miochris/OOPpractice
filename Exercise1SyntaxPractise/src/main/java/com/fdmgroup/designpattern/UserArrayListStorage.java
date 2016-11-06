package com.fdmgroup.designpattern;

import java.util.ArrayList;
import java.util.List;

public class UserArrayListStorage implements IStorage {

	private List<User> users = new ArrayList<User>();

	@Override
	public void create(User user) {
		users.add(user);

	}

	@Override
	public User read(int id) {
		for (User u : users) {
			if (u.getId() == id) {
				return u;
			}

		}
		return null;
	}

	@Override
	public void update(User updatedUser) {
		for (User u : users) {
			if (u.getId() == updatedUser.getId()) {
				u=updatedUser;
			}
		}

	}

	@Override
	public void delete(int id) {

		for (User u : users) {
			if (u.getId() == id) {
				users.remove(u);
			}

		}
	}

	@Override
	public List<User> readAll() {
		// TODO Auto-generated method stub
		return users;
	}

}
