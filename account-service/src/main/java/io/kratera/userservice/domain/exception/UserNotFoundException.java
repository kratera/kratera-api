package io.kratera.userservice.domain.exception;

public class UserNotFoundException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;

	public UserNotFoundException(long id){
		super("User with id = " + id +" was not found.");
	}
	
}
