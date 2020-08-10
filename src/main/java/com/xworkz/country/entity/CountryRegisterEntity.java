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
@Table(name = "COUNTRY_REGISTER_TABLE")
public class CountryRegisterEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	private static final Logger LOGGER = Logger.getLogger(CountryRegisterEntity.class);

	public CountryRegisterEntity() {
		LOGGER.info("created\t" + this.getClass().getSimpleName());
	}

	@Id
	@Column(name = "COUNTRY_ID")
	@GenericGenerator(name = "auto", strategy = "increment")
	@GeneratedValue(generator = "auto")
	private Integer countryId;
	@Column(name = "COUNTRY_EMAIL")
	private String countryEmail;
	@Column(name = "COUNTRY_NAME")
	private String countryName;
	@Column(name = "COUNTRY_POPULATION")
	private Integer countryPopulation;
	@Column(name = "COUNTRY_CONTINENT")
	private String countryContinent;
	@Column(name = "COUNTRY_CAPITAL")
	private String countryCapital;

	public Integer getCountryId() {
		return countryId;
	}

	public void setCountryId(Integer countryId) {
		this.countryId = countryId;
	}

	public String getCountryEmail() {
		return countryEmail;
	}

	public void setCountryEmail(String countryEmail) {
		this.countryEmail = countryEmail;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public Integer getCountryPopulation() {
		return countryPopulation;
	}

	public void setCountryPopulation(Integer countryPopulation) {
		this.countryPopulation = countryPopulation;
	}

	public String getCountryContinent() {
		return countryContinent;
	}

	public void setCountryContinent(String countryContinent) {
		this.countryContinent = countryContinent;
	}

	public String getCountryCapital() {
		return countryCapital;
	}

	public void setCountryCapital(String countryCapital) {
		this.countryCapital = countryCapital;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public static Logger getLogger() {
		return LOGGER;
	}

}
