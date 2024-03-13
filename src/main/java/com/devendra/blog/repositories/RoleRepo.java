package com.devendra.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devendra.blog.entities.Role;

public interface RoleRepo extends JpaRepository<Role, Integer> {
	
	

}
