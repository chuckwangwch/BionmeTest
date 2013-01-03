package com.bionme.dao;

import org.hibernate.Session;

import com.bionme.base.BasemeterDAO;


public class meterDAO extends BasemeterDAO implements com.bionme.dao.iface.meterDAO {

	public meterDAO () {}
	
	public meterDAO (Session session) {
		super(session);
	}


}