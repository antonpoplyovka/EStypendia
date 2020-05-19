package com.kul.Estypendia.service;

import com.kul.Estypendia.controller.DTO.AdminReportDTORecord;
import com.kul.Estypendia.controller.DTO.StudentReportDTORecord;
import com.kul.Estypendia.model.PaymentsLog;
import com.kul.Estypendia.model.Student;
import com.kul.Estypendia.repository.PaymentsLogRepo;
import com.kul.Estypendia.repository.StudentRepo;
import com.kul.Estypendia.repository.TypeOfHousingRepo;
import com.kul.Estypendia.repository.TypeOfStudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ReportService {
    private final StudentRepo studentRepo;
    private final PaymentsLogRepo paymentsLogRepo;
    private final TypeOfHousingRepo typeOfHousingRepo;
    private final TypeOfStudentRepo typeOfStudentRepo;

    @Autowired
    public ReportService(StudentRepo studentRepo, PaymentsLogRepo paymentsLogRepo, TypeOfHousingRepo typeOfHousingRepo, TypeOfStudentRepo typeOfStudentRepo) {
        this.studentRepo = studentRepo;
        this.paymentsLogRepo = paymentsLogRepo;
        this.typeOfHousingRepo = typeOfHousingRepo;
        this.typeOfStudentRepo = typeOfStudentRepo;
    }

    public List<StudentReportDTORecord> studentReport(BigInteger studentId) {
        List<StudentReportDTORecord> studentReportDTORecords = new ArrayList<>();
        Optional<Student> student = studentRepo.findById(studentId.intValue());
        List<PaymentsLog> paymentsLogList = paymentsLogRepo.findAllByStudentId(studentId);
        if (student.isPresent())
            for (PaymentsLog paymentsLog : paymentsLogList) {
                StudentReportDTORecord studentReportDTORecord = new StudentReportDTORecord(paymentsLog.getPaymentAmount(), paymentsLog.getPaymentDate());
                studentReportDTORecords.add(studentReportDTORecord);
            }
        return  studentReportDTORecords;
    }


    public List<AdminReportDTORecord> adminReport() {
        List<AdminReportDTORecord> adminReportDTORecords = new ArrayList<>();
        List<Student> studentsList = studentRepo.findAll();
        for (Student student : studentsList) {
            int monthlyPayment = typeOfStudentRepo.findById(student.getTypeOfStudent()).get().getMonthlyPayment() - typeOfHousingRepo.findById(student.getAddressType()).get().getCost();
            AdminReportDTORecord adminReportDTORecord = new AdminReportDTORecord(student.getSurname(),student.getName(), monthlyPayment);
            adminReportDTORecords.add(adminReportDTORecord);
        }
        return adminReportDTORecords;
    }
}
