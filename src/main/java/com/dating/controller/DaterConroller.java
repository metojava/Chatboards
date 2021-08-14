package com.dating.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dating.model.Dater;
import com.dating.repos.DaterRepository;

@RestController
@RequestMapping("/dater/api")
//@CrossOrigin()
public class DaterConroller {

	@Autowired
	DaterRepository daterRepository;

	@GetMapping(path = "/all")
	public Iterable<Dater> getAllUsers() {
		return daterRepository.findAll();
	}

	@GetMapping(path = "/{id}")
	public ResponseEntity<Dater> getDaterById(@PathVariable("id") Integer userId) {
		Optional<Dater> dater = daterRepository.findById(userId);
		if (dater.isPresent()) {
			return new ResponseEntity<Dater>(dater.get(), HttpStatus.OK);
		}

		return new ResponseEntity<Dater>(HttpStatus.NOT_FOUND);

	}
}
