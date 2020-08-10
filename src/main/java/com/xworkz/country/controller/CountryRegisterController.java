package com.xworkz.country.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.xworkz.country.dto.CountryRegisterDTO;
import com.xworkz.country.service.CountryRegisterService;

@Component
@RequestMapping("/")
public class CountryRegisterController {
	private static final Logger LOGGER = Logger.getLogger(CountryRegisterController.class);

	public CountryRegisterController() {
		LOGGER.info(":::::Created \t:::::" + this.getClass().getSimpleName());
	}

	@Autowired
	private CountryRegisterService countryRegisterService;

	@RequestMapping(value = "/register.odc", method = RequestMethod.POST)
	public String countryRegister(CountryRegisterDTO countryRegisterDTO, Model model) {
		try {
			LOGGER.info(":::::Start Invoked countryRegister() method:::::");
			LOGGER.info(":::::Start CountryRegisterDTO:::::"+countryRegisterDTO);
			int check = this.countryRegisterService.validateAndCreate(countryRegisterDTO);
			if (check == 0) {

				return "index";
			} else {
				LOGGER.info(":::::Data is Not Validated Back to Main Page:::::");
				return "index";
			}
		} catch (Exception e) {
			LOGGER.error(e.getMessage(), e);
		}
		LOGGER.info(":::::End Invoked countryRegister() method:::::");
		return null;
	}
}
