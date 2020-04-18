package com.kul.Estypendia.repository;

import com.kul.Estypendia.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AddressRepo extends JpaRepository<Address, Integer> {
    List<Address> findAllByStudentId (Integer studentId);

}
