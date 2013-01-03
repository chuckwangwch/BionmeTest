package com.bionme.dao;

import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;
import com.bionme.domain.Meter;

public class MeterDAOImpl implements MeterDAO {

	private HibernateTemplate hibernateTemplate;
	public void setSessionFactory(SessionFactory sessionFactory)
	{
	this.hibernateTemplate = new HibernateTemplate(sessionFactory);
	}
	@Override

	public void saveUser(Meter meter) {

	hibernateTemplate.saveOrUpdate(meter);
	}
	@Override
	public List<Meter> listMeter() {
		
	
		return null;
	}

	
}



