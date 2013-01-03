package com.bionme.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bionme.dao.dataDAO;
import com.bionme.form.dataform;

@Service
public class dataServiceImpl implements dataService {
	
	@Autowired
	private dataDAO datadao;
	
	@Transactional
	public void addData(dataform data) {
		datadao.addData(data);
	}
	
	@Transactional
	public List<dataform> listDataform() {
		return datadao.listDataform();
	}
	
	@Transactional
	public void removeData(Integer id) {
		datadao.removeData(id);
	}
	
}
