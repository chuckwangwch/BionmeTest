package com.bionme.dao;

import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;
import com.bionme.domain.Meter;

public class MeterDAOImpl implements MeterDAO {

	private HibernateTemplate hibernateTemplate;
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory)
	{
	this.hibernateTemplate = new HibernateTemplate(sessionFactory);
	}
	@Override

	public void saveMeter(Meter meter) {

	hibernateTemplate.saveOrUpdate(meter);
	}
	@Override
	public List<Meter> listMeter() {
		
		return sessionFactory.getCurrentSession().createQuery("meterList").list();
		//return (List<Meter>) sessionFactory.getCurrentSession().createCriteria(Meter.class).list();
	
	}

	
}



