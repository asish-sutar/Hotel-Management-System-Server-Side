package com.crud.hotel.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.hotel.model.User;

import java.util.Optional;

/**
 * @author Simpson Alfred
 */

public interface UserRepository extends JpaRepository<User, Long> {
    boolean existsByEmail(String email);

    void deleteByEmail(String email);

   Optional<User> findByEmail(String email);
}
