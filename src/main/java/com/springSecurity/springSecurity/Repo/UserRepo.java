package com.springSecurity.springSecurity.Repo;

import com.springSecurity.springSecurity.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
}
