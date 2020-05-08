package com.kul.Estypendia.controller;

import com.kul.Estypendia.controller.DTO.AdminReportDTORecord;
import com.kul.Estypendia.controller.DTO.StudentReportDTORecord;
import com.kul.Estypendia.service.PDFService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.kul.Estypendia.service.ReportService;
import com.kul.Estypendia.service.StudentService;

import java.io.IOException;
import java.util.List;

@Api("Controller reports")
@RestController
@RequestMapping(value = "api/v1/report")
public class ReportController {

    private ReportService reportService;
    private StudentService studentService;
    private PDFService pdfService;

    @Autowired
    public ReportController(ReportService reportService, StudentService studentService, PDFService pdfService) {
        this.reportService = reportService;
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
    public List<StudentReportDTORecord> getStudentReport(@PathVariable Integer studentId) {
        return reportService.studentReport(studentId);
    }

}
