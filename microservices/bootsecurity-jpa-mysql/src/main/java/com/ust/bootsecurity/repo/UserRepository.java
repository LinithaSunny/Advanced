package com.ust.bootsecurity.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ust.bootsecurity.model.User;

public interface UserRepository extends JpaRepository<User,Integer> {
	Optional<User> findByUserName(String UserName);
	

}
