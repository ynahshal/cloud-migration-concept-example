package de.wdr.docker.prototype.service;

import java.util.Optional;

import javax.annotation.Resource;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import de.wdr.docker.prototype.model.UserEntry;
import de.wdr.docker.prototype.repo.UserRepository;
import lombok.Getter;

@Service
@Getter
public class UserServiceDefault implements UserService {
	
	@Resource
	private UserRepository userRepo;
	
	@Override
	@Transactional
	public void addUser(UserEntry user) {
		userRepo.save(user);
	}

	@Override
	public Page<UserEntry> getAllUsers() {
		return (Page<UserEntry>) userRepo.findAll();
	}

	@Override
	public Optional<UserEntry> getUserById(long id) {
		return userRepo.findById(id);
	}

	
}
