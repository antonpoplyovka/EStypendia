package com.kul.Estypendia.controller.DTO;

import javax.persistence.Column;
import java.time.Instant;
import java.util.List;

public class StudentReportDTO {
    private List<StudentReportDTORecord> studentReportDTORecords;

    public StudentReportDTO() {
    }

    public StudentReportDTO(List<StudentReportDTORecord> studentReportDTORecords) {
        this.studentReportDTORecords = studentReportDTORecords;
    }

    public List<StudentReportDTORecord> getStudentReportDTORecords() {
        return studentReportDTORecords;
    }

    public void setStudentReportDTORecords(List<StudentReportDTORecord> studentReportDTORecords) {
        this.studentReportDTORecords = studentReportDTORecords;
    }
}
