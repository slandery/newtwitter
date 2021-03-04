package com.tts.twitter.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tts.twitter.model.Role;

@Repository
public interface RoleRepository extends CrudRepository<Role, Long>{
	Role findByRole(String role);
}