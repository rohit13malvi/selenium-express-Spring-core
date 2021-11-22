package com.napier.it.sim_assignment;

public class User {

	private Sim usersim;

	
	
	public void setUsersim(Sim usersim) {
		this.usersim = usersim;
	}



	public void UserCalling() {
		usersim.sim();
//		System.out.println("User Started calling useing " + usersim);
	}
}
