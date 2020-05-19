package com.kul.Estypendia.controller;

import com.kul.Estypendia.model.Address;
import com.kul.Estypendia.model.Student;
import com.kul.Estypendia.repository.AddressRepo;
import com.kul.Estypendia.repository.StudentRepo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Api("Controller for address management")
@RestController
@RequestMapping(value = "api/v1/address")
public class AddressController {
    private AddressRepo addressRepo;
    private StudentRepo studentRepo;

    @Autowired
    public AddressController(AddressRepo addressRepo, StudentRepo studentRepo) {
        this.addressRepo = addressRepo;
        this.studentRepo = studentRepo;
    }

    @ApiOperation(value = "Get all addresses")
    @GetMapping("/")
    public List<Address> getAllAddresses() {
        return addressRepo.findAll();
    }

    @ApiOperation(value = "Get all addresses for student")
    @GetMapping("/{studentId}")
    public List<Address> getAllAddressesForStudent(@PathVariable Integer studentId) {
        List<Address> returnList = new ArrayList<>();
        Optional<Student> student = studentRepo.findById(studentId);
        Address addressOfResidence = addressRepo.findById(student.get().getAddressOfResidence()).get();
        Address actualAddress = addressRepo.findById(student.get().getActualAddress()).get();
        returnList.add(addressOfResidence);
        returnList.add(actualAddress);


        return returnList;
    }

    @ApiOperation(value = "Add new address for student")
    @PostMapping("/")
    public Address addNewAddressForStudent(@RequestBody Address address) {
        return addressRepo.save(address);
    }

    @ApiOperation(value = "Edit address")
    @PutMapping("/{id}")
    public ResponseEntity<Address> editStudent(@PathVariable Integer id, @RequestBody Address editedAddress) {

        Optional<Address> addressOptional = addressRepo.findById(id);
        if (!addressOptional.isPresent()) {
            return ResponseEntity.notFound().build();
        }
        addressOptional = Optional.ofNullable(editedAddress);
        addressRepo.save(addressOptional.get());
        return new ResponseEntity<>(addressOptional.get(), HttpStatus.OK);

}
}
