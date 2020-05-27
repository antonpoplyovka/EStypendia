package com.kul.Estypendia.controller;

import com.kul.Estypendia.controller.DTO.AdminReportDTORecord;
import com.kul.Estypendia.controller.DTO.StudentReportDTORecord;
import com.kul.Estypendia.model.Student;
import com.kul.Estypendia.model.User;
import com.kul.Estypendia.repository.StudentRepo;
import com.kul.Estypendia.service.PDFService;
import com.kul.Estypendia.service.ReportService;
import com.kul.Estypendia.service.StudentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

@Api("Controller reports")
@RestController
@RequestMapping(value = "api/v1/report")
public class ReportController {

    private ReportService reportService;
    private StudentRepo studentRepo;
    private StudentService studentService;
    private PDFService pdfService;

    @Autowired
    public ReportController(ReportService reportService, StudentRepo studentRepo, StudentService studentService, PDFService pdfService) {
        this.reportService = reportService;
        this.studentRepo = studentRepo;
        this.studentService = studentService;
        this.pdfService = pdfService;
    }

    @ApiOperation(value = "Get Admin report")
    @GetMapping("/admin")
    public List<AdminReportDTORecord> getAdminReport() throws IOException {
        pdfService.createPDFForAdminReport();
        return reportService.adminReport();
    }
    @ApiOperation(value = "Get Student report")
    @GetMapping("/student/{studentId}")
    public List<StudentReportDTORecord> getStudentReport(@PathVariable BigInteger studentId) {
        return reportService.studentReport(studentId);
    }
    @ApiOperation(value = "Get  report for authenticated student")
    @GetMapping("/student")
    public List<StudentReportDTORecord> getStudentReport(@AuthenticationPrincipal User user) {
        Optional<Student> student = studentRepo.findByEmail(user.getEmail());
        if(student.isPresent()) {
            BigInteger studentId = BigInteger.valueOf(student.get().getId());
            return reportService.studentReport(studentId);
        }
        return null;
    }

}
