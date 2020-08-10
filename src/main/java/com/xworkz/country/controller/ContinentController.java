package com.xworkz.country.controller;

import java.util.List;

import javax.annotation.PostConstruct;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.xworkz.country.dto.CountryDTO;
import com.xworkz.country.service.CountryService;

@Component
@RequestMapping("/")
public class ContinentController {

	private static final Logger LOGGER = Logger.getLogger(ContinentController.class);

	private List<CountryDTO> seList;

	@Autowired
	private CountryService countryService;

	@PostConstruct
	public void init() {
		LOGGER.info("Start init()");
		seList = countryService.validateFetchByType("COUNTRY");
		LOGGER.info("End init()");
	}

	public ContinentController() {
		LOGGER.info("Created \t" + this.getClass().getSimpleName());
	}

	@RequestMapping(value = "/continentlanding.odc", method = RequestMethod.GET)
	public String continentlanding(Model model) {
		LOGGER.info("Start Invoked continentlanding() method");
		//LOGGER.info(seList);
		model.addAttribute("selist", seList);
		LOGGER.info("End Invoked continentlanding() method");
		return "index";
	}

}
