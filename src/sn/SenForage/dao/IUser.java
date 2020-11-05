package sn.SenForage.dao;

import sn.SenForage.entities.User;

public interface IUser {
	
	public int add(User user);
	
	public User getUserByEmailAndPassword(String email, String password);

}
