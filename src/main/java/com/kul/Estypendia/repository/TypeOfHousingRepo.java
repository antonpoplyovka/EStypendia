package com.kul.Estypendia.repository;

import com.kul.Estypendia.model.TypeOfHousing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TypeOfHousingRepo extends JpaRepository<TypeOfHousing, Integer> {
}
