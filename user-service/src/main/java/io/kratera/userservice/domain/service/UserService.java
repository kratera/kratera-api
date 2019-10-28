package io.kratera.userservice.domain.service;

import java.util.List;

import org.springframework.stereotype.Service;

import io.kratera.userservice.domain.entity.KrateraUser;

@Service
public interface UserService {

	KrateraUser save(KrateraUser user);

	KrateraUser update(long id, KrateraUser user);

	void delete(long id);

	List<KrateraUser> findAll();

	KrateraUser findById(long id);
	
}
