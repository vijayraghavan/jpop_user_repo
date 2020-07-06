package com.user.services.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.user.services.domain.objects.User;
import com.user.services.libraryuserservice.LibraryUserService;
import com.user.services.util.GenericResponse;

@RestController
@RequestMapping("/libraryUser")
public class LibraryUserController {

	
	@Autowired
	LibraryUserService libraryUserService;

	@GetMapping
	private GenericResponse<User> getUserDetails(@PathVariable int userId){
		
		return libraryUserService.getUserDetails(userId);
	}
	

}
