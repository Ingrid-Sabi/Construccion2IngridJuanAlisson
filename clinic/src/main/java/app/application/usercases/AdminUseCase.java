package app.application.usercases;

import app.domain.model.User;
import app.domain.model.emuns.Role;
import app.domain.services.CreateUser;

public class AdminUseCase {
	
	private CreateUser createUser;

	public void createDoctors(User user) throws Exception {
		user.setRole(Role.DOCTORS);
		createUser.createUser(user);
	}
	
	public void createNurse(User user) throws Exception {
		user.setRole(Role.NURSE);
		createUser.createUser(user);
	}
	
	public void createNurse(User user) throws Exception {
		user.setRole(Role.NURSE);
		createUser.createUser(user);
	}
	
	public void createNurse(User user) throws Exception {
		user.setRole(Role.NURSE);
		createUser.createUser(user);
	}

}
