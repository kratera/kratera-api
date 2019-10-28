package io.kratera.userservice.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.kratera.userservice.domain.entity.KrateraUser;
import io.kratera.userservice.resource.repository.UserRepository;

@Service
public class UserServiceIm implements UserService {
	
	private final UserRepository repository;
	
	@Autowired
	public UserServiceIm(UserRepository repository) {
		this.repository = repository;
	}

	@Override
	public KrateraUser save(KrateraUser user) {
		repository.save(user);
		return user;
	}

	@Override
	public KrateraUser update(long id, KrateraUser user) {
		return null;
	}

	@Override
	public void delete(long id) {
		
	}

	@Override
	public List<KrateraUser> findAll() {
		return repository.findAll();
	}

	@Override
	public KrateraUser findById(long id) {
		return repository.findById(id).get();
	}

}
