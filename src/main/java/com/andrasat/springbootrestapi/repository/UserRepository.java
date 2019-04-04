package com.andrasat.springbootrestapi.repository;

import com.andrasat.springbootrestapi.entity.User;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * UserRepository
 */
public interface UserRepository extends JpaRepository<User, Long> {
  User findByEmail(String email);
}