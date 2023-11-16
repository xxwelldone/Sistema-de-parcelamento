package quinta_etapa.ecommerce.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Installments {
    public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private Date dueDate;
    private double amount;

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Installments(Date dueDate, double amount) {
        this.dueDate = dueDate;
        this.amount = amount;
    }
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Data: " + sdf.format(getDueDate())+ "\n");
        sb.append("Valor: " + getAmount()+ "\n");
        return sb.toString();

    }
}
