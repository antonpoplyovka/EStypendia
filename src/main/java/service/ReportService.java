package service;

import com.kul.Estypendia.controller.DTO.AdminReportDTO;
import com.kul.Estypendia.controller.DTO.AdminReportDTORecord;
import com.kul.Estypendia.controller.DTO.StudentReportDTO;
import com.kul.Estypendia.controller.DTO.StudentReportDTORecord;
import com.kul.Estypendia.model.PaymentsLog;
import com.kul.Estypendia.model.Student;
import com.kul.Estypendia.repository.PaymentsLogRepo;
import com.kul.Estypendia.repository.StudentRepo;
import com.kul.Estypendia.repository.TypeOfHousingRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ReportService {
    private final StudentRepo studentRepo;
    private final PaymentsLogRepo paymentsLogRepo;
    private final TypeOfHousingRepo typeOfHousingRepo;

    @Autowired
    public ReportService(StudentRepo studentRepo, PaymentsLogRepo paymentsLogRepo, TypeOfHousingRepo typeOfHousingRepo) {
        this.studentRepo = studentRepo;
        this.paymentsLogRepo = paymentsLogRepo;
        this.typeOfHousingRepo = typeOfHousingRepo;
    }

    public StudentReportDTO studentReport(Integer studentId) {
        List<StudentReportDTORecord> studentReportDTORecords = new ArrayList<>();
        Optional<Student> student = studentRepo.findById(studentId);
        List<PaymentsLog> paymentsLogList = paymentsLogRepo.findAllByStudentId(studentId);
        if (student.isPresent())
            for (PaymentsLog paymentsLog : paymentsLogList) {
                StudentReportDTORecord studentReportDTORecord = new StudentReportDTORecord(paymentsLog.getPaymentAmount(), paymentsLog.getPaymentDate());
                studentReportDTORecords.add(studentReportDTORecord);
            }
        return new StudentReportDTO(studentReportDTORecords);
    }


    public AdminReportDTO adminReport() {
        List<AdminReportDTORecord> adminReportDTORecords = new ArrayList<>();
        List<Student> studentsList = studentRepo.findAll();
        for (Student student : studentsList) {
            int monthlyPayment = student.getTypeOfStudent().getMonthlyPayment() - student.getAddressType().getCost();
            AdminReportDTORecord adminReportDTORecord = new AdminReportDTORecord(student.getSurname(), monthlyPayment);
            adminReportDTORecords.add(adminReportDTORecord);
        }
        return new AdminReportDTO(adminReportDTORecords);
    }
}
