package com.kul.Estypendia.controller;

import com.kul.Estypendia.model.TypeOfHousing;
import com.kul.Estypendia.repository.TypeOfHousingRepo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@Api("Type of housing  reports")
@RestController
@RequestMapping(value = "api/v1/typeOfHousing")
public class TypeOfHousingController {

    private TypeOfHousingRepo typeOfHousingRepo;

    @Autowired
    public TypeOfHousingController(TypeOfHousingRepo typeOfHousingRepo) {
        this.typeOfHousingRepo = typeOfHousingRepo;
    }
    @ApiOperation(value = "Get all TypesOfHousing")
    @GetMapping("/")
    public List<TypeOfHousing> getAllTypeOfHousing() {
        return typeOfHousingRepo.findAll();
    }
    @ApiOperation(value = "Get TypesOfHousing by id")
    @GetMapping("/{id}")
    public Optional<TypeOfHousing> getTypeOfHousingById(@PathVariable Integer id) {
        return typeOfHousingRepo.findById(id);
    }
}
