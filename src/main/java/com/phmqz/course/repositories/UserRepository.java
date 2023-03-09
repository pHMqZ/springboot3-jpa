package com.phmqz.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.phmqz.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
