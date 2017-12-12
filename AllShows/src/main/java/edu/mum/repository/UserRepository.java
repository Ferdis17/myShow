package edu.mum.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import edu.mum.domain.User;

public interface UserRepository extends CrudRepository<User, Integer>{
	
	@Query(value = "SELECT u FROM User u WHERE u.userName = :userName")
    User findUsersByUserName( String userName);

}
