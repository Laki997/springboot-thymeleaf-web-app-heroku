package sport.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sport.DAO.FootballerDAO;

@Service
public class FootballerService {
	
	private FootballerDAO footballerDAO;
	
	@Autowired
	public FootballerService(FootballerDAO theFootballerDAO) {
		footballerDAO=theFootballerDAO;
	}
	
	
	
	
	

}
