package com.kul.Estypendia.controller;

import com.kul.Estypendia.model.Student;
import com.kul.Estypendia.repository.StudentRepo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.kul.Estypendia.service.StudentService;

import java.util.List;
import java.util.Optional;

@Api("Controller for address management")
@RestController
@RequestMapping(value = "api/v1/students")
public class StudentController {
    private StudentRepo studentRepo;
    private StudentService studentService;

    @Autowired
    public StudentController(StudentRepo studentRepo, StudentService studentService) {
        this.studentRepo = studentRepo;
        this.studentService = studentService;
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

    @ApiOperation(value = "Edit student")
    @PutMapping("/{id}")
    public ResponseEntity<Student> editStudent(@PathVariable Integer id, @RequestBody Student newStudent) {
        Optional<Student> student = studentRepo.findById(id);
        if(student.isPresent()){
            return new ResponseEntity<>(studentService.editStudent(id, newStudent),HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }
}
