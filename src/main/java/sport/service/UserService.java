package sport.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import sport.entity.User;
import sport.web.dto.UserRegistrationDTO;

public interface UserService extends UserDetailsService {
	
	public User save(UserRegistrationDTO userRegistrationDTO);
		
	

}
