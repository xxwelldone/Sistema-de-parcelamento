package quinta_etapa.ecommerce.services;

public class PayPalService implements OnlinePaymentService {

    @Override
    public double paymentFree(double amount) {
        return amount*0.02;
    }

    @Override
    public double interest(double amount, int month) {
        return (amount*0.01)*month;
    }
}
