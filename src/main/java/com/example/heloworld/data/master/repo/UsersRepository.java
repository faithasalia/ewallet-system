package com.example.heloworld.data.master.repo;

import com.example.heloworld.data.master.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, String>{
}
