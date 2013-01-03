package com.bionme.service;

import java.util.List;

import com.bionme.form.dataform;

public interface dataService {
	
	public void addData(dataform data);
	public List<dataform> listDataform();
	public void removeData(Integer id);

}
