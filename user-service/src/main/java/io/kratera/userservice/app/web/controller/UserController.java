package io.kratera.userservice.app.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import io.kratera.userservice.domain.service.UserService;
import io.kratera.util.JsonTransformer;
import spark.Spark;

@Component
public class UserController {
	
	@Autowired
	public UserController(UserService service, JsonTransformer transform){
		Spark.get("users", (req, res) -> {
			return "Olá";
		}, transform);
	}
	
}
