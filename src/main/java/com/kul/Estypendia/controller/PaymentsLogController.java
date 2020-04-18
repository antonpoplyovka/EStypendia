package com.kul.Estypendia.controller;

import com.kul.Estypendia.model.PaymentsLog;
import com.kul.Estypendia.repository.PaymentsLogRepo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api("Controller for address management")
@RestController
@RequestMapping(value = "api/v1/paymentsLog")
public class PaymentsLogController {

    private PaymentsLogRepo paymentsLogRepo;

    @Autowired
    public PaymentsLogController(PaymentsLogRepo paymentsLogRepo) {
        this.paymentsLogRepo = paymentsLogRepo;
    }

    @ApiOperation(value = "Get all paymentLogs")
    @GetMapping("/")
    public List<PaymentsLog> getAllPaymentLogs() {
        return paymentsLogRepo.findAll();
    }

    @ApiOperation(value = "Get all paymentsLog for student")
    @GetMapping("/student/{studentId}")
    public List<PaymentsLog> getAllAddressesForStudent(@PathVariable Integer studentId) {
        return paymentsLogRepo.findAllByStudentId(studentId);
    }

    @ApiOperation(value = "Add new paymentsLog for student")
    @PostMapping("/")
    public PaymentsLog addNewAddressForStudent(@RequestBody PaymentsLog paymentsLog) {
        return paymentsLogRepo.save(paymentsLog);
    }
}
