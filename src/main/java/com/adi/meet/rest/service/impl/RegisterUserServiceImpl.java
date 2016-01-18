package com.adi.meet.rest.service.impl;

import javax.ws.rs.Consumes;
import javax.ws.rs.Path;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;

import com.adi.meet.rest.interfaces.RegisterUserService;

@Path("register")
public class RegisterUserServiceImpl implements RegisterUserService {
	@Path("/user")
	@Consumes(MediaType.APPLICATION_JSON)
	public void registerUser() throws Exception {
		throw new Exception("You faggot !!");
	}

}
