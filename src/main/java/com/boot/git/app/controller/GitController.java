package com.boot.git.app.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

// http://localhost:8090/gitController/sample

@Controller
@RequestMapping(value = "/gitController")
public class GitController {

	private static final Logger LOGGER = LoggerFactory.getLogger(GitController.class.getSimpleName());

	@RequestMapping(value = "/sample", produces = MediaType.TEXT_PLAIN_VALUE, method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<String> sampleController() {
		LOGGER.info("I am in sampleController dude......hurry123465781234");
		LOGGER.info("I am in sampleController dude...... we lost the game");	
		LOGGER.info("I am in sampleController dude...... we lost the game");
		LOGGER.info("I am in sampleController dude......hurry123465781234testttt");
               LOGGER.info("I am in sampleController dude......hurry123465781234testtttbranch2");
		return new ResponseEntity<String>("Sucessfully done", HttpStatus.OK);
	}

}
