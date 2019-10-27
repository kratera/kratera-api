package io.kratera.userservice.domain.service;

import java.util.List;

import org.springframework.stereotype.Service;

import io.kratera.userservice.domain.entity.KrateraUser;

@Service
public class UserServiceIm implements UserService {

	@Override
	public KrateraUser save(KrateraUser user) {
		return null;
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
		return null;
	}

	@Override
	public KrateraUser findById(long id) {
		return null;
	}

}
