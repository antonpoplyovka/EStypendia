package com.kul.Estypendia.controller;

import com.kul.Estypendia.controller.DTO.AdminReportDTORecord;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.kul.Estypendia.service.ReportService;
import com.kul.Estypendia.service.StudentService;

import java.util.List;

@Api("Controller reports")
@RestController
@RequestMapping(value = "api/v1/report")
public class ReportController {

    private ReportService reportService;
    private StudentService studentService;

    @Autowired
    public ReportController(ReportService reportService, StudentService studentService) {
        this.reportService = reportService;
        this.studentService = studentService;
    }

    @ApiOperation(value = "Get Admin report")
    @GetMapping("/admin")
    public List<AdminReportDTORecord> getAdminReport() {
        return reportService.adminReport();
    }
//    @ApiOperation(value = "Get Student report")
//    @GetMapping("/student")
//    public StudentReportDTO getStudentReport() {
//        return reportService.adminReport();
//    }
//
//    @ApiOperation(value = "Get student by Id")
//    @GetMapping("/student/{studentId}")
//    public Optional<Student> getStudentById(@PathVariable Integer studentId) {
//        return studentRepo.findById(studentId);
//    }
}
