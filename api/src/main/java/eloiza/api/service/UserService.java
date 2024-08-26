package eloiza.api.service;

import eloiza.api.domain.model.User;

public interface UserService {
	
	User findById(Long id);
	
	User create (User userToCreate);
	
	

}
