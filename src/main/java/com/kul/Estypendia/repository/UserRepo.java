package com.kul.Estypendia.repository;

import com.kul.Estypendia.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,String> {
}
