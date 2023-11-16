package quinta_etapa.ecommerce.entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contract {

    public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private int number = (int) (Math.random() * 1000);
    private Date date;
    private double totalAmount;
    private List<Installments> installments = new ArrayList<>();


    public int getNumber() {
        return number;
    }

    public List<Installments> getInstallment() {
        return installments;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Contract(Date date, double totalAmount) {

        this.date = date;
        this.totalAmount = totalAmount;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Número do contrato: " + getNumber() + "\n");
        sb.append("Data do contrato: " + sdf.format(getDate()) + "\n");
        sb.append("Valor total: " + getTotalAmount() + "\n");

        return sb.toString();

    }
}
