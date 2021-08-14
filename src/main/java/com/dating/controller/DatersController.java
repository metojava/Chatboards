package com.dating.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dating.model.Daters;
import com.dating.repos.DatersRepository;

@RestController
@RequestMapping("/daters/api/datersBlockOrUnblock")
public class DatersController {

//	task 01	paid profile is active
//	task 02	"hi" message (available for paid membership)
//	task 03	user message
//	task 04	blocking the user

	@Autowired
	DatersRepository datersRepository;

	@PostMapping(path = "/datersBlockOrUnblock")
	public ResponseEntity blockUser(@RequestBody Daters daters) {
		datersRepository.save(daters);
		if (daters.getIsBlockedBy() > 0) {
			return ResponseEntity.status(HttpStatus.CREATED).body("you have successfully blocked this user");
		}

		return ResponseEntity.status(HttpStatus.CREATED).body("you have successfully unblocked this user");
	}

}
