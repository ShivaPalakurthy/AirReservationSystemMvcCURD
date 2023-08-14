package com.flightreservation.flight.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.flightreservation.flight.dao.FlightDataDAO;
import com.flightreservation.flight.model.FlightData;

@Controller
public class MainController {
	@Autowired
	private FlightDataDAO flightDataDAO;
	
	@RequestMapping(value="/")
	public ModelAndView listFlightData(ModelAndView model) {
		List<FlightData> listFlightDetails=flightDataDAO.list();
		model.addObject("listFlightData",listFlightDetails);
		model.setViewName("index");
		return model;
	}
	
	@RequestMapping(value="/new", method=RequestMethod.GET)
	public  ModelAndView newFlight(ModelAndView model){
		FlightData newFlight=new FlightData();
		model.addObject("newFlightData",newFlight);
		model.setViewName("NewFlight");
		return model;
	}
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public ModelAndView saveFlight(@ModelAttribute FlightData Fdata){ 
		flightDataDAO.add(Fdata); 
		return new ModelAndView("redirect:/");
	}
	@RequestMapping(value="/edit", method=RequestMethod.GET)
	public ModelAndView editFlight(HttpServletRequest request){
		Integer id=Integer.parseInt(request.getParameter("id"));
		FlightData FData= flightDataDAO.get(id);
		ModelAndView model=new ModelAndView("Update");
		model.addObject("UpdateFData",FData);
		return model;
	}
	
	@RequestMapping(value="/update", method=RequestMethod.POST)
	public ModelAndView UpdateFlight(@ModelAttribute FlightData Fdata){ 
			flightDataDAO.update(Fdata); 
		return new ModelAndView("redirect:/");
	}
	@RequestMapping(value="/delete", method=RequestMethod.GET)
	public ModelAndView deleteFlight(@RequestParam Integer id){
		flightDataDAO.delete(id);
		
		return new ModelAndView("redirect:/");
	}
}
