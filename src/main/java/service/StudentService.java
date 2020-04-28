package service;

import com.kul.Estypendia.model.Student;
import com.kul.Estypendia.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;


public class StudentService {
    private StudentRepo studentRepo;

    @Autowired
    public StudentService(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    @Transactional
    public Student editStudent(Integer studentId, Student newStudent){
        Optional<Student> student = studentRepo.findById(studentId);
        if (student.isPresent()){
            student.get().setName(newStudent.getName());
            student.get().setSurname(newStudent.getSurname());
            student.get().setAddressType(newStudent.getAddressType());
            student.get().setCountryOfBirth(newStudent.getCountryOfBirth());
            student.get().setFatherName(newStudent.getFatherName());
            student.get().setNationality(newStudent.getNationality());
            student.get().setNationalityOfBirth(newStudent.getNationalityOfBirth());
            student.get().setPlaceOfBirth(newStudent.getPlaceOfBirth());
            student.get().setTypeOfStudent(newStudent.getTypeOfStudent());
            return student.get();
        }
        return null;
    }

}
