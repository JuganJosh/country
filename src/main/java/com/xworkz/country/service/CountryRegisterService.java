package com.xworkz.country.service;

import com.xworkz.country.dto.CountryRegisterDTO;

public interface CountryRegisterService {

	public int validateAndCreate(CountryRegisterDTO countryRegisterDTO);

}
