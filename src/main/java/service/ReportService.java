package service;

import com.kul.Estypendia.model.PaymentsLog;
import com.kul.Estypendia.model.Student;
import com.kul.Estypendia.repository.PaymentsLogRepo;
import com.kul.Estypendia.repository.StudentRepo;
import com.kul.Estypendia.repository.TypeOfHousingRepo;
import org.springframework.beans.factory.annotation.Autowired;

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

     public void adminReport() {
        List<Student> studentsList = studentRepo.findAll();

         for(Student student: studentsList ){
             int monthlyPayment = student.getTypeOfStudent().getMonthlyPayment() - student.getAddressType().getCost();
             System.out.println(student.getSurname() + "/" + monthlyPayment );
         }

    }
}
