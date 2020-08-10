package com.xworkz.country.dao;

import java.util.List;

import com.xworkz.country.entity.CountryEntity;

public interface CountryDAO {

	public List<CountryEntity> fetchAllByType(String type);

}
