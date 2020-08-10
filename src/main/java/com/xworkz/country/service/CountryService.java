package com.xworkz.country.service;

import java.util.List;

import com.xworkz.country.dto.CountryDTO;

public interface CountryService {

	public List<CountryDTO> validateFetchByType(String type);

}
