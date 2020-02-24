package com.huzaifa.data;

import com.huzaifa.model.User;

public interface UserDAO {

	public void addUser(User user)throws Exception;
	public User getUser(String userId)throws Exception;
}
