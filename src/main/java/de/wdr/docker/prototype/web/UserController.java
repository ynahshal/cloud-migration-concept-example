package de.wdr.docker.prototype.web;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import de.wdr.docker.prototype.model.UserEntry;
import de.wdr.docker.prototype.service.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserController {

	private UserService userService;
	
	@Autowired
	public  UserController(UserService userService) {
		this.userService = userService;
	}
	
	@PostMapping(path="/add", consumes = "application/json")
	public String addUser(@RequestBody UserEntry user) {
		userService.addUser(user);
		return "User Add";
	}
	
	@GetMapping("/getAll")
	public Page<UserEntry> getAllUsers(){
		return userService.getAllUsers();
	}
	
	@GetMapping("/{userId}")
	public Optional<UserEntry> getById(@PathVariable Long userId) {
		return userService.getUserById(userId);
	}
}
