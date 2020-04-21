package service;

import com.kul.Estypendia.model.PaymentsLog;
import com.kul.Estypendia.model.Student;
import com.kul.Estypendia.repository.PaymentsLogRepo;
import com.kul.Estypendia.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class ReportService {
    private final StudentRepo studentRepo;
    private final PaymentsLogRepo paymentsLogRepo;

    @Autowired
    public ReportService(StudentRepo studentRepo, PaymentsLogRepo paymentsLogRepo) {
        this.studentRepo = studentRepo;
        this.paymentsLogRepo = paymentsLogRepo;
    }

    public String studentReport (Integer studentId) {
        Optional<Student>  student = studentRepo.findById(studentId);
        List<PaymentsLog> paymentsLogList = paymentsLogRepo.findAllByStudentId(studentId)
        String surname = "";
        if(student.isPresent()){
            surname = student.get().getSurname();
        }
        for (PaymentsLog paymentsLog: paymentsLogList) {
            System.out.println(surname + "/" + paymentsLog.getPaymentAmount()+ "/" + paymentsLog.getPaymentDate());
        }
        return "";
    }


}
