package com.bionme.dao;

import java.util.List;

import com.bionme.form.dataform;

public interface dataDAO {
	
	public void addData(dataform data);
	public List<dataform> listDataform();
	public void removeData(Integer id);

}
