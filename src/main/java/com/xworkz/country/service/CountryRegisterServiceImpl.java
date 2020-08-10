package com.xworkz.country.service;

import java.util.Objects;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.country.dao.CountryRegisterDAO;
import com.xworkz.country.dto.CountryRegisterDTO;

@Repository
public class CountryRegisterServiceImpl implements CountryRegisterService {

	private static final Logger LOGGER = Logger.getLogger(CountryRegisterServiceImpl.class);

	public CountryRegisterServiceImpl() {
		LOGGER.info("Created \t" + this.getClass().getSimpleName());
	}
	
	@Autowired
	private CountryRegisterDAO countryRegisterDAO;

	@Override
	public int validateAndCreate(CountryRegisterDTO countryRegisterDTO) {
		LOGGER.info(":::::Start : CountryRegisterServiceImp validateAndCreate():::::");
		int valid = 1;
		try {
			if (Objects.nonNull(countryRegisterDTO)) {
				String countryEmail = countryRegisterDTO.getCountryEmail();
				System.out.println(countryEmail);
				if (Objects.nonNull(countryEmail) && !countryEmail.isEmpty()) {
					LOGGER.info(":::::CountryEmail is valid:::::");
					valid = 0;
				} else {
					LOGGER.info(":::::CountryEmail is not valid:::::"); 
					valid = 1;
				}
				String countryName = countryRegisterDTO.getCountryName();
				if (Objects.nonNull(countryName) && !countryName.isEmpty()) {
					LOGGER.info(":::::CountryName is valid:::::");
					valid = 0;
				} else {
					LOGGER.info(":::::CountryName is not valid:::::"); 
					valid = 1;
				}
				Integer countryPopulation = countryRegisterDTO.getCountryPopulation();
				if (Objects.nonNull(countryPopulation)) {
					LOGGER.info(":::::CountryPopulation is valid:::::");
					valid = 0;
				} else {
					LOGGER.info(":::::CountryPopulation is not valid:::::"); 
					valid = 1;
				}
				String countryContinent = countryRegisterDTO.getCountryContinent();
				if (Objects.nonNull(countryContinent) && !countryContinent.isEmpty()) {
					LOGGER.info(":::::CountryContinent is valid:::::");
					valid = 0;
				} else {
					LOGGER.info(":::::CountryContinent is not valid:::::"); 
					valid = 1;
				}
				String countryCapital = countryRegisterDTO.getCountryCapital();
				if (Objects.nonNull(countryCapital) && !countryCapital.isEmpty()) {
					LOGGER.info(":::::CountryCapital is valid:::::");
					valid = 0;
				} else {
					LOGGER.info(":::::CountryCapital is not valid:::::"); 
					valid = 1;
				}
				if (valid == 0) {
					LOGGER.info(":::::All Fields Are valid:::::");
					LOGGER.info(":::::CountryRegisterEntity to CountryRegisterDTO:::::");
					//CountryRegisterEntity countryRegisterEntity = new CountryRegisterEntity();
					//BeanUtils.copyProperties(countryRegisterDTO, countryRegisterEntity);
					//LOGGER.info(":::::CountryRegisterEntity:::::"+countryRegisterEntity);
					countryRegisterDAO.save(countryRegisterDTO);
					return valid;
				}
			}
		} catch (Exception e) {
			LOGGER.error(":::::Start : Exception Handler:::::" + e);
			e.printStackTrace();
		}
		LOGGER.info(":::::End : CountryRegisterServiceImp validateAndCreate():::::");
		return valid;
	}

}
