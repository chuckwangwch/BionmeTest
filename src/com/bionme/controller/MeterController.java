package com.bionme.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import com.bionme.dao.MeterDAO;
import com.bionme.domain.Meter;


public class MeterController extends MultiActionController {

	private MeterDAO meterDAO;

	public void setMeterDAO(MeterDAO meterDAO) {
		this.meterDAO = meterDAO;
	
	}
		
	public ModelAndView add(HttpServletRequest request,
		HttpServletResponse response, Meter meter) throws Exception {
		meterDAO.saveUser(meter);
		return new ModelAndView("redirect:list.htm");
	
	}
	
	public ModelAndView list(HttpServletRequest request, HttpServletResponse response) throws Exception {
	
		ModelMap modelMap = new ModelMap();
		modelMap.addAttribute("meterList", meterDAO.listMeter());
		modelMap.addAttribute("meter", new Meter());
		return new ModelAndView("meterForm", modelMap);
	
	}


}


