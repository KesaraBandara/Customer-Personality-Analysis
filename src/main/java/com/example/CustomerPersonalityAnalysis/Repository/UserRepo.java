package com.example.CustomerPersonalityAnalysis.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.CustomerPersonalityAnalysis.Model.User;





public interface UserRepo extends JpaRepository<User, Long>{
	
	public User findByEmail(String email);

}
