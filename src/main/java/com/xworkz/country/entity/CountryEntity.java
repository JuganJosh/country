package com.xworkz.country.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.apache.log4j.Logger;
import org.hibernate.annotations.GenericGenerator;


@Entity
@Table(name = "COUNTRY_TABLE")
@NamedQueries({
		@NamedQuery(name = "fetchAllByType", query = "select cont from CountryEntity cont where countrytype=:type"),

})
public class CountryEntity implements Serializable{
	private static final Logger LOGGER = Logger.getLogger(CountryEntity.class);

	@Id
	@Column(name = "COUNTRY_ID")
	@GenericGenerator(name = "auto", strategy = "increment")
	@GeneratedValue(generator = "auto")
	private Integer countryid;
	@Column(name = "COUNTRY_NAME")
	private String countryname;
	@Column(name = "COUNTRY_TYPE")
	private String countrytype;

	public CountryEntity() {
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
	
	
}
