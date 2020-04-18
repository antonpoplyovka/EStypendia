package com.kul.Estypendia.controller;

import com.kul.Estypendia.model.Address;
import com.kul.Estypendia.repository.AddressRepo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api("Controller for address management")
@RestController
@RequestMapping(value = "api/v1/address")
public class AddressController {
    private AddressRepo addressRepo;

    @Autowired
    public AddressController(AddressRepo addressRepo) {
        this.addressRepo = addressRepo;
    }
    @ApiOperation(value = "Get all addresses")
    @GetMapping("/")
    public List<Address> getAllAddresses() {
        return addressRepo.findAll();
    }

    @ApiOperation(value = "Get all addresses for student")
    @GetMapping("/student/{studentId}")
    public List<Address> getAllAddressesForStudent(@PathVariable Integer studentId) {
        return addressRepo.findAllByStudentId(studentId);
    }

    @ApiOperation(value = "Add new address for student")
    @PostMapping("/student/{studentId}")
    public Address addNewAddressForStudent(@PathVariable Integer studentId,@RequestBody Address address) {
        return addressRepo.save(address);
    }
}
