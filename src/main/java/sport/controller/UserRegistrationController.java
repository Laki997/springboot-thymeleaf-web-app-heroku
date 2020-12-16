package sport.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import sport.service.UserService;
import sport.web.dto.UserRegistrationDTO;

@Controller
@RequestMapping("/registration")
public class UserRegistrationController {
   
	private UserService userService;
	
	public UserRegistrationController(UserService theUserService) {
		userService=theUserService;
	}
	
	@ModelAttribute("user")
	public UserRegistrationDTO userRegistrationDTO() {
		UserRegistrationDTO userRegistrationDTO = new UserRegistrationDTO();
		return userRegistrationDTO;
	}
	
	@GetMapping
	public String showRegistrationForm() {
		return "registration";
	}
	
	
	
	@PostMapping
	public String registerUserAccount(@ModelAttribute("user") UserRegistrationDTO userRegistrationDTO) {
		
		userService.save(userRegistrationDTO);
		
		return "redirect:/registration?success";
		
		
	}
}
