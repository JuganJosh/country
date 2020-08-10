package com.xworkz.country.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.apache.log4j.Logger;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.country.dao.CountryDAO;
import com.xworkz.country.dto.CountryDTO;
import com.xworkz.country.entity.CountryEntity;

@Service
public class CountryServiceImpl implements CountryService {
	private static final Logger LOGGER = Logger.getLogger(CountryServiceImpl.class);

	public CountryServiceImpl() {
		LOGGER.info("Created \t" + this.getClass().getSimpleName());
	}

	@Autowired
	private CountryDAO countryDAO;

	@Override
	public List<CountryDTO> validateFetchByType(String type) {
		try {
			LOGGER.info("Start :CountryServiceImp Class validateFetchByType : " + type);
			List<CountryEntity> fetchedEntity = countryDAO.fetchAllByType(type);

			if (Objects.nonNull(fetchedEntity)) {
				LOGGER.info("List is found and its size is : " + fetchedEntity.size());
				List<CountryDTO> list = new ArrayList<CountryDTO>();
				for (CountryEntity fetch : fetchedEntity) {
					CountryDTO dto = new CountryDTO();
					LOGGER.info("Copying data from dto to entity");
					BeanUtils.copyProperties(fetch, dto);
					list.add(dto);
					LOGGER.info("Adding all the dto's to list" + list);
				}
				return list;
			} else {
				LOGGER.info("Any List found in the Entity");
				return null;
			}
		} catch (Exception e) {
			LOGGER.info("wrong Service" + e);
		}
		return null;
	}

}
