package app.domain.services;

import app.domain.model.User;
import app.domain.ports.UserPort;

public class CreateUser {
	
	private UserPort userPort;
	
	public void createUser(User user) throws Exception {
		
		
		if (user == null) {
			throw new Exception("El usuario no puede ser nulo");
		}
		
		
		if (userPort.findByDocument(user) != null) {
			throw new Exception("Ya existe una persona registrada con esa cédula");
		}
		
		
		if (user.getUserName() == null || user.getUserName().isEmpty()) {
			throw new Exception("El nombre de usuario es obligatorio");
		}
		
		if (userPort.findByUserName(user) != null) {
			throw new Exception("Ya existe una persona registrada con ese nombre de usuario");
		}
		
		
		if (user.getPassword() == null || user.getPassword().isEmpty()) {
			throw new Exception("La contraseña es obligatoria");
		}
		if (user.getPassword().length() < 6) {
			throw new Exception("La contraseña debe tener al menos 6 caracteres");
		}
		
		
		if (user.getEmail() == null || ((User) user.getEmail()).isEmpty()) {
			throw new Exception("El correo electrónico es obligatorio");
		}
		if (!((String) user.getEmail()).contains("@")) {
			throw new Exception("El correo electrónico no es válido");
		}
		
		
		userPort.save(user);
	}
}