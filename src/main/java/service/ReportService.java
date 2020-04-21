package service;

import com.kul.Estypendia.model.Student;
import com.kul.Estypendia.repository.StudentRepo;
import com.kul.Estypendia.controller.StudentController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class ReportService {
    private final StudentRepo studentRepo;

    @Autowired
    public ReportService(@Qualifier("postgres") StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    public int addStudent(Student student){
        return studentRepo.insertStudent(student);
    }

    public List<Student> getAllPeople(){
        return studentRepo.selectAllStudent();

}

}
