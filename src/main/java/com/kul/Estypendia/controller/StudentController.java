package com.kul.Estypendia.controller;

import com.kul.Estypendia.model.Student;
import com.kul.Estypendia.repository.StudentRepo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Api("Controller for address management")
@RestController
@RequestMapping(value = "api/v1/students")
public class StudentController {
    private StudentRepo studentRepo;

    @Autowired
    public StudentController(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    @ApiOperation(value = "Get all students")
    @GetMapping("/")
    public List<Student> getAllStudents() {
        return studentRepo.findAll();
    }

    @ApiOperation(value = "Get student by Id")
    @GetMapping("/student/{studentId}")
    public Optional<Student> getStudentById(@PathVariable Integer studentId) {
        return studentRepo.findById(studentId);
    }

    @ApiOperation(value = "Add new Student")
    @PostMapping("/")
    public Student addNewAddressForStudent(@RequestBody Student student) {
        return studentRepo.save(student);
    }
}
