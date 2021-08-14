package com.dating.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dating.model.Dater;
import com.dating.model.Daters;
import com.dating.model.DatersMessage;
import com.dating.repos.DaterRepository;
import com.dating.repos.DatersMessageRepository;
import com.dating.repos.DatersRepository;

@RestController
@RequestMapping("/datersMessage/api")
public class DatersMessageController {

	@Autowired
	DaterRepository daterRepository;

	@Autowired
	DatersRepository datersRepository;

	@Autowired
	DatersMessageRepository datersMessageRepository;

	@PostMapping(path = "/datersMessage")
	public ResponseEntity postMessage(@RequestBody DatersMessage datersMessage) {
		Optional<Dater> dater = daterRepository.findById(datersMessage.getUserId());
		
		if (dater.isPresent()) {
			Dater dts = dater.get();

			if ((dts.getEnabled() == 0) && (dts.getPaid_membership() == 0)) {
				return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(
						"you are disabled or haven't paid for membership. "
						+ "please make payment to communicate with other users");
			}
		}

		Optional<Daters> dated = datersRepository.findById(datersMessage.getDateId());
		if (dated.isPresent()) {
			Daters ds = dated.get();
			if (ds.getIsBlockedBy() > 0) {
				return ResponseEntity.status(HttpStatus.BAD_REQUEST)
						.body("this user has blocked you, you can't send message");
			}
		}

		datersMessageRepository.save(datersMessage);
		return new ResponseEntity<DatersMessage>(datersMessage, HttpStatus.CREATED);
	}

}
