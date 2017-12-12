package edu.mum.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import edu.mum.domain.Role;

public interface RoleRepository extends CrudRepository<Role, Integer>{
	
	 @Query(value = "SELECT r FROM Role r WHERE r.role = :role")
	    Role findRoleByRoleName(@Param("role") String role);
}
