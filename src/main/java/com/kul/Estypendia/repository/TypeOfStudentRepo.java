package com.kul.Estypendia.repository;

import com.kul.Estypendia.model.TypeOfHousing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeOfStudentRepo extends JpaRepository<TypeOfHousing,Integer> {
}