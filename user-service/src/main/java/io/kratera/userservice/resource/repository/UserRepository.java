package io.kratera.userservice.resource.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.kratera.userservice.domain.entity.KrateraUser;

@Repository
public interface UserRepository extends JpaRepository<KrateraUser, Long> {
	
}
