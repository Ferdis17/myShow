package edu.mum.service;

import edu.mum.domain.User;

public interface UserService {
	
	void save(User user);

    User findUserByUsername(String userName);

    User findOne(int userId);

}
