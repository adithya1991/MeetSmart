package com.adi.meet.rest.interfaces;

import javax.ws.rs.Consumes;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

@Path("/register")
public interface RegisterUserService {
	@Path("/user")
	@Consumes(MediaType.APPLICATION_JSON)
	public void registerUser() throws Exception;
}
