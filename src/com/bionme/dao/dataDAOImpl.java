package com.bionme.dao;

import java.util.List;
import com.bionme.form.dataform;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class dataDAOImpl implements dataDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public void addData(dataform data) {
		sessionFactory.getCurrentSession().save(data);
	}
	
	public List<dataform> listDataform() {
		return sessionFactory.getCurrentSession().createQuery("form Datalist").list();
	}

	public void removeData(Integer id) {
		dataform data = (dataform) sessionFactory.getCurrentSession().load(dataform.class, id);
		if (null != data) {
			sessionFactory.getCurrentSession().delete(data);
		}
	}
	
	
}
