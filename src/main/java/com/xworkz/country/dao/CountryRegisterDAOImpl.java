package com.xworkz.country.dao;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.country.dto.CountryRegisterDTO;

@Component
public class CountryRegisterDAOImpl implements CountryRegisterDAO {

	private static final Logger LOGGER = Logger.getLogger(CountryRegisterDAOImpl.class);

	public CountryRegisterDAOImpl() {
		LOGGER.info("Created \t" + this.getClass().getSimpleName());
	}
	
	private SessionFactory factory;

	@Autowired
	public void setFactory(SessionFactory factory) {
		this.factory = factory;
	}
	
	/*public CountryRegisterDAOImpl(SessionFactory factory) {
		LOGGER.info("Created \t" + this.getClass().getSimpleName());
		this.factory = factory;
	}*/

	@Override
	public void save(CountryRegisterDTO countryRegisterDTO) {
		LOGGER.info(":::::Start : CountryDaoimpl Class save():::::"+countryRegisterDTO);
		Session session = this.factory.openSession();
		try {
			LOGGER.info(":::::Begin the Transaction:::::");
			session.beginTransaction();
			LOGGER.info(":::::Save the Entity::::::"+countryRegisterDTO);
			session.save(countryRegisterDTO);
			// session.save(visitEntity);
			LOGGER.info(":::::Commit the Transcation:::::");
			session.getTransaction().commit();
			LOGGER.info(":::::Inserted successfully:::::");
			LOGGER.info(":::::End of the Save Method:::::");

		} catch (Exception e) {
			LOGGER.error(":::::Create is Unsuccesssfully And RollBack:::::");
			session.getTransaction().rollback();
			e.printStackTrace();
		} finally {
			session.close();
			LOGGER.info(":::::Using Finally Session is Closed:::::");
		}
		LOGGER.info(":::::End : CountryDaoimpl Class save():::::");
	}

}
