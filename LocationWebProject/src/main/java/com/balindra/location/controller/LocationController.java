package com.balindra.location.controller;

import java.util.List;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.balindra.location.entity.Location;
import com.balindra.location.repos.LocationRepository;
import com.balindra.location.service.LocationService;
import com.balindra.location.util.EmailUtil;
import com.balindra.location.util.ReportUtil;

@Controller
public class LocationController {
	
	@Autowired
	private  LocationService service;
	
	@Autowired
	private LocationRepository locRepo;
	
	@Autowired
	private ReportUtil reportUtil;

	
	@Autowired 
	private EmailUtil emailutil;
	
	@Autowired 
	private ServletContext sc;
	
	@GetMapping("/location")
	public String getCreateLocationPage(@ModelAttribute("location") Location location) {
		return "createlocation";
		
	}
	
	@PostMapping("/location")
	public String saveLocation(@ModelAttribute("location") Location location,Model model) {
		Location savedlocation=service.saveLocation(location);
		model.addAttribute("savedloc",savedlocation );
		
		//sending an email
		emailutil.sendEmail("balindrasmtptest123@gmail.com", "location Saved ", "Location Saved scucessfully :details\n"+savedlocation);
		
		return "savedlocation";
	}
	
	@PostMapping("/delete")
	public String deleteLocation(@RequestParam("id")int id) {
		service.deleteLocation(id);
		return "redirect:/locations";
	}
	
	@GetMapping("/locations")
	public String displayLocations(Model model) {
		model.addAttribute("locations", service.getAllLocations());
		
		return "locations";
		
	}
	
	@GetMapping("/update")
	public String updatePage(@RequestParam("id") int id, Model model) {
		
		model.addAttribute("location",service.getLocationById(id));
		return "editlocation";
	}
	
	@PostMapping("/update")
	public String updateLocation( @ModelAttribute("newlocation")Location location, Model model) {
		service.updateLocation(location);
		model.addAttribute("location", location);
		return "savedlocation";
	}
	
	@GetMapping("/generate/report")
	public String generateReport(){
		String path=sc.getRealPath("/");
		System.out.println("\n===============================");
		System.out.println(path);
		System.out.println(sc.getContextPath());
		System.out.println("===============================\n");
		List<Object[]> datas=locRepo.findTypeAndTypCount();
		
		reportUtil.generatePieChart(path, datas);
		return "report";
	}
	
}
