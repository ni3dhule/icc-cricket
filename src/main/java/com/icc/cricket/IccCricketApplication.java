package com.icc.cricket;

import com.icc.cricket.controller.ICCTeamController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IccCricketApplication {
	private static Logger logger = LoggerFactory.getLogger(ICCTeamController.class);
	public static void main(String[] args) {
		logger.info("STARTING ICC CRICKET SERVICE ...");
		SpringApplication.run(IccCricketApplication.class, args);
		logger.info("ICC CRICKET SERVICE IS UP AND RUNNING ...");
	}

}
