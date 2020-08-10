package com.xworkz.country.dto;

import org.apache.log4j.Logger;

public class CountryDTO {

	private static final Logger LOGGER = Logger.getLogger(CountryDTO.class);
	private Integer countryid;
	private String countryname;
	private String countrytype;

	public CountryDTO() {
		LOGGER.info("created\t" + this.getClass().getSimpleName());
	}

	public Integer getCountryid() {
		return countryid;
	}

	public void setCountryid(Integer countryid) {
		this.countryid = countryid;
	}

	public String getCountryname() {
		return countryname;
	}

	public void setCountryname(String countryname) {
		this.countryname = countryname;
	}

	public String getCountrytype() {
		return countrytype;
	}

	public void setCountrytype(String countrytype) {
		this.countrytype = countrytype;
	}

	public static Logger getLogger() {
		return LOGGER;
	}

	@Override
	public String toString() {
		return "CountryDTO [countryid=" + countryid + ", countryname=" + countryname + ", countrytype=" + countrytype
				+ "]";
	}

	public CountryDTO(Integer countryid, String countryname, String countrytype) {
		super();
		this.countryid = countryid;
		this.countryname = countryname;
		this.countrytype = countrytype;
	}
	

}
