package com.kul.Estypendia.controller;

import com.kul.Estypendia.model.TypeOfStudent;
import com.kul.Estypendia.repository.TypeOfStudentRepo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Api("Type of student ")
@RestController
@RequestMapping(value = "api/v1/typeOfStudent")
public class TypeOfStudentController {
    private TypeOfStudentRepo typeOfStudentRepo;

    @Autowired
    public TypeOfStudentController(TypeOfStudentRepo typeOfStudentRepo) {
        this.typeOfStudentRepo = typeOfStudentRepo;
    }

    @ApiOperation(value = "Get all TypesOfStudent")
    @GetMapping("/")
    public List<TypeOfStudent> getAllTypeOfStudent() {
        return typeOfStudentRepo.findAll();
    }

    @ApiOperation(value = "Get TypesOfHouTypesOfStudent by id")
    @GetMapping("/{id}")
    public Optional<TypeOfStudent> getTypeOfStudentById(@PathVariable Integer id) {
        return typeOfStudentRepo.findById(id);
    }

    @ApiOperation(value = "Add new Student Type")
    @PostMapping("/")
    public TypeOfStudent createNewStudentType(@RequestBody TypeOfStudent typeOfStudent) {
        return typeOfStudentRepo.save(typeOfStudent);
    }

    @ApiOperation(value = "Edit student type Student Type")
    @PutMapping("/{id}")
    public ResponseEntity<TypeOfStudent> createNewStudentType(@PathVariable Integer id, @RequestBody TypeOfStudent typeOfStudent) {
        Optional<TypeOfStudent> optionalTypeOfStudent = typeOfStudentRepo.findById(id);
        if (!optionalTypeOfStudent.isPresent()) {
            return ResponseEntity.notFound().build();
        }
        optionalTypeOfStudent = Optional.ofNullable(typeOfStudent);
        typeOfStudentRepo.save(optionalTypeOfStudent.get());
        return new ResponseEntity<>(optionalTypeOfStudent.get(), HttpStatus.OK);
    }


}
