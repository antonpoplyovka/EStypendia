package com.kul.Estypendia.repository;

import com.kul.Estypendia.model.AdminUsers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AdminUsersRepo extends JpaRepository<AdminUsers, Integer> {
    Optional<AdminUsers> findByEmail (String email);

}
