package com.kul.Estypendia.controller.DTO;

import java.util.List;

public class AdminReportDTO {
    private List<AdminReportDTORecord> adminReportDTORecords;


    public AdminReportDTO(List<AdminReportDTORecord> adminReportDTORecords) {
        this.adminReportDTORecords = adminReportDTORecords;
    }

    public List<AdminReportDTORecord> getAdminReportDTORecords() {
        return adminReportDTORecords;
    }

    public void setAdminReportDTORecords(List<AdminReportDTORecord> adminReportDTORecords) {
        this.adminReportDTORecords = adminReportDTORecords;
    }
}
