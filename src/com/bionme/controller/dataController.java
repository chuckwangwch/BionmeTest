package com.bionme.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bionme.meter;
import com.bionme.dao.meterDAO;
import com.bionme.form.dataform;
import com.bionme.service.dataService;

@Controller
public class dataController {
	
	@Autowired
	private dataService dataservice;
	public meterDAO meterdao = new meterDAO();
	
	@RequestMapping(value="/list", method= RequestMethod.POST)
	public String listData(Map<String,Object>map) {
		
		map.put("data", new meter());
		map.put("dataList", meterdao.findAll());
	
		return "dataList";
	}
	
	@RequestMapping(value="/add", method= RequestMethod.POST)
	public String addData(@ModelAttribute("data") dataform data, BindingResult result) {
		meterdao = new meterDAO();
		//dataservice.addData(data);
		//meterdao.save(data);
	
		return "redirect:/list.htm";
	}
	
	@RequestMapping("/delete/{dataformId")
	public String removeData(@PathVariable("dataformId") Integer dataformId) {
		
		dataservice.removeData(dataformId);
		
		return "redirect:/";
	}
	
}
