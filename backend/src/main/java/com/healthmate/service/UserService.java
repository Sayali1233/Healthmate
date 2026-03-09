package com.healthmate.service;

import java.util.List;

import com.healthmate.entities.Role;
import com.healthmate.entities.User;

public interface UserService {
	User userRegistration(User u);
	
	List<User> getAllUsers();
	
	User getUserById(Long id);
	
	User updateUser(Long id, User updatedUser);
	
	void deleteUser(Long id);
	
	List<User> getUsersByRole(Role role);

	long getPatientCounts();
	
	
}
