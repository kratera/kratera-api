package io.kratera.userservice.app.web.controller;

import java.util.Arrays;
import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import io.kratera.userservice.domain.entity.KrateraRole;
import io.kratera.userservice.domain.entity.KrateraUser;
import io.kratera.userservice.domain.service.UserService;
import io.kratera.util.JsonTransformer;
import spark.Spark;

@Component
public class UserController {
	
	@Autowired
	public UserController(UserService service, JsonTransformer transform){
		Spark.get("users", (req, res) -> {
			return service.findAll();
		}, transform);
		
		Spark.post("users", (req, res) -> {
			KrateraUser user = new KrateraUser();
			user.setUsername("test");
			user.setEmail("andersori@emal");
			user.setFirstName("Teste");
			user.setPassword("21212");
			user.setVerified(false);
			user.setRoles(new HashSet<KrateraRole>(Arrays.asList(KrateraRole.USER, KrateraRole.ADMIN)));
			return service.save(user);
		});
	}
	
}
