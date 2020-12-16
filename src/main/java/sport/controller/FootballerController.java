package sport.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import sport.DAO.FootballerDAO;
import sport.entity.Footballer;

@Controller
@RequestMapping("/footballers")
public class FootballerController {

	private FootballerDAO footballerDAO;
	
	List<Footballer> theFootballers = new ArrayList<Footballer>();
	
	@Autowired
	public FootballerController(FootballerDAO theFootballerDAO) {
		footballerDAO = theFootballerDAO;
	}
	
	
	@GetMapping("/all")
	public String listFootballers(Model theModel) {
		
		theFootballers = footballerDAO.findAll();
		
		theModel.addAttribute("footballers", theFootballers);
		
		return "list-footballers";
		
	}
	
	@GetMapping("/showFormForAdd")
	public String saveFootballers( Model theModel) {
		
		Footballer theFootballer = new Footballer();
		
		theModel.addAttribute("footballers", theFootballer);
		
		return "footballer-form";
		
	}
	
	@PostMapping("/save")
	public String saveFootballer(@ModelAttribute("footballers") Footballer theFootballer ) {
		
		footballerDAO.save(theFootballer);
		
		return "redirect:/footballers/all";
	}
	
	@GetMapping("/showFormForUpdate")
	public String updateFootballers(@RequestParam("footballerID")int theId, Model theModel) {
		
		Optional<Footballer> footballer = footballerDAO.findById(theId);
		
		theModel.addAttribute("footballers", footballer);
		
		return "footballer-form";
	}
	
	@GetMapping("/delete")
	public String deleteFootballers(@RequestParam("footballerID") int theId) {
		
		footballerDAO.deleteById(theId);
		
		return "redirect:/footballers/all";
	}
	
	
	
	
		
	}
	

