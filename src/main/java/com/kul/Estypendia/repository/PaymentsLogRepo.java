package com.kul.Estypendia.repository;

import com.kul.Estypendia.model.PaymentsLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PaymentsLogRepo  extends JpaRepository<PaymentsLog, Integer> {
    List<PaymentsLog> findAllByStudentId (Integer studentId);
}
