package com.kul.Estypendia.repository;

import com.kul.Estypendia.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface StudentRepo  extends JpaRepository<Student,Integer> {
    List<Student> selectAllStudent();

    int insertStudent(Student student);
}
