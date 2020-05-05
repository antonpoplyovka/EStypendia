package com.kul.Estypendia.repository;

import com.kul.Estypendia.model.TypeOfHousing;
import com.kul.Estypendia.model.TypeOfStudent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeOfStudentRepo extends JpaRepository<TypeOfStudent,Integer> {
}
