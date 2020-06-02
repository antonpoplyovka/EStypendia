package com.kul.Estypendia.controller;

import com.kul.Estypendia.model.TypeOfStudent;
import com.kul.Estypendia.repository.TypeOfStudentRepo;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

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
}
