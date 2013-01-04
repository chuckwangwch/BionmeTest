package com.bionme.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import com.bionme.dao.MeterDAO;
import com.bionme.domain.Meter;


@Controller
@RequestMapping("/meter")
public class CopyOfMeterController extends MultiActionController {

	private MeterDAO meterDAO;

	@Autowired
	public void setMeterDAO(MeterDAO meterDAO) {
		this.meterDAO = meterDAO;
	
	}
	
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public ModelAndView add(HttpServletRequest request,
		HttpServletResponse response, Meter meter) throws Exception {
		meterDAO.saveMeter(meter);
		return new ModelAndView("redirect:list.htm");
	
	}
	
	@RequestMapping(value="/list", method=RequestMethod.GET)
	
	
	public ModelAndView list(HttpServletRequest request, HttpServletResponse response) throws Exception {
	
		ModelMap modelMap = new ModelMap();
		modelMap.addAttribute("meterList", meterDAO.listMeter());
		modelMap.addAttribute("meter", new Meter());
		return new ModelAndView("meterForm", modelMap);
	
	}


}


