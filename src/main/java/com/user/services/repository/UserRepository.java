package com.user.services.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.user.services.domain.objects.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	User getByUserId(int userId);
	Boolean deleteByUserId(int userId);
}
