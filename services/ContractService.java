package quinta_etapa.ecommerce.services;

import quinta_etapa.ecommerce.entities.Contract;
import quinta_etapa.ecommerce.entities.Installments;

import java.util.Calendar;
import java.util.Date;

public class ContractService {


    public void processContract(Contract c,
                                int installment,
                                OnlinePaymentService paymentService) {

        double perInstallment = c.getTotalAmount() / installment;
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(c.getDate());

        for (int i = 1; i <= installment; i++) {
            calendar.add(Calendar.MONTH, 1);
            Date month = calendar.getTime();

            double interest = paymentService.interest(perInstallment, i);
            double fee = paymentService.paymentFree(perInstallment);
            double amount = perInstallment + interest + fee;
            c.getInstallment().add(new Installments(month, amount));

        }

    }
}
