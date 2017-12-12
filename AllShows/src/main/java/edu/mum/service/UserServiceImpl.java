package edu.mum.service;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import edu.mum.domain.Role;
import edu.mum.domain.User;
import edu.mum.repository.RoleRepository;
import edu.mum.repository.UserRepository;

public class UserServiceImpl implements UserService{
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	RoleRepository roleRepository;
	
	@Autowired
	BCryptPasswordEncoder bCryptPasswordEncoder;

	@Override
	public void save(User user) {
		user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
		user.setActive(1);
		Role userRole = roleRepository.findRoleByRoleName("ADMIN");
		user.setRoles(new ArrayList<>(Arrays.asList(userRole)));
		userRepository.save(user);
		
	}

	@Override
	public User findUserByUsername(String userName) {
		return userRepository.findUsersByUserName(userName);
	}

	@Override
	public User findOne(int userId) {
		return userRepository.findOne(userId);
	}
	
	

}
