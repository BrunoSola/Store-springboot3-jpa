package com.brunosola.Store.repositories;

import com.brunosola.Store.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
