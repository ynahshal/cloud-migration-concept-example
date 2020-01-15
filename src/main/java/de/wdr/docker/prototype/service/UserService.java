package de.wdr.docker.prototype.service;

import java.util.Optional;
import org.springframework.data.domain.Page;
import de.wdr.docker.prototype.model.UserEntry;

public interface UserService {

	/**
	 * 
	 * @param user
	 */
	public void addUser(UserEntry user);
	
	/**
	 * 
	 * @return
	 */
	public Page<UserEntry> getAllUsers();
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	public Optional<UserEntry> getUserById(long id);
}
