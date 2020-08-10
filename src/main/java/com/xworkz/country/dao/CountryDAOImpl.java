package com.xworkz.country.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;

import com.xworkz.country.entity.CountryEntity;

@Component
public class CountryDAOImpl implements CountryDAO {
	private static final Logger LOGGER = Logger.getLogger(CountryDAOImpl.class);

	public CountryDAOImpl() {
		LOGGER.info("Created \t" + this.getClass().getSimpleName());
	}

	private SessionFactory factory;

	public void setFactory(SessionFactory factory) {
		this.factory = factory;
	}

	@Override
	public List<CountryEntity> fetchAllByType(String type) {
		LOGGER.info("Start : CountryDaoimpl Class : "+type);
		Session session = this.factory.openSession();
		try {
			LOGGER.info("START : CountryDaoimpl Class fetchAllByType " + type);

			Query query = session.getNamedQuery("fetchAllByType");
			Query query1 = query.setParameter("type", type);

			LOGGER.info("Query Excute---->" + query);

			List<CountryEntity> fetchedList = query.list();
			LOGGER.info("SE list from daoimpl is :" + fetchedList);

			LOGGER.info("End : CountryDaoimpl Class");
			return fetchedList;
		} catch (HibernateException hibernate) {
			LOGGER.info("Hibernate Exception in fetchAllByType " + hibernate.getMessage());
		} finally {
			session.close();
		}
		return null;
	}

}
