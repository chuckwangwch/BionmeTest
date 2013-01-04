package com.bionme.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.validation.BindingResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import com.bionme.dao.MeterDAO;
import com.bionme.domain.Meter;


@Controller
@RequestMapping("/meters")
public class MeterController extends MultiActionController {

	private MeterDAO meterDAO;

	@Autowired
	public void setMeterDAO(MeterDAO meterDAO) {
		this.meterDAO = meterDAO;
	
	}
	
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public ModelAndView add(@ModelAttribute("meters") Meter meter, BindingResult result) {
		meterDAO.saveMeter(meter);
		return new ModelAndView("redirect:/list.htm");
	
	}
	
	@RequestMapping(value="/list", method=RequestMethod.GET)
	public ModelAndView listMeter() {
		
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("meters", meterDAO.listMeter());
		
		return new ModelAndView("meterList", model);
		
	
	}


}


