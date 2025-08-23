package app.domain.services;

import app.domain.model.User;
import app.domain.ports.UserPort;

public class UserService {
	
	private UserPort userPort;
	
	public void createUser(User user) throws Exception {
		
		if(userPort.findByDocument(user)!=null) {
			throw new Exception ("Ya existe una persona registrada con esa cedula");	
		}
		
		if(userPort.findByUserName(user)!=null) {
			throw new Exception ("Ya existe una persona registrada con ese nombre de usuario");	
		}
		userPort.save(user);
		
	}

}
