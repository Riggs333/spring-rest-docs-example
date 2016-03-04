package de.myplayground;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserController {

	@Autowired
	UserRepository userRepo;

	@RequestMapping(method = RequestMethod.GET)
	public Iterable<User> getUsers() {
		return userRepo.findAll();
	}

}
