package com.gokul.reactform.repository;

import com.gokul.reactform.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // No need to write any code here — JPA gives CRUD methods automatically!
}
