package quinta_etapa.ecommerce;

import quinta_etapa.ecommerce.entities.Contract;
import quinta_etapa.ecommerce.services.ContractService;
import quinta_etapa.ecommerce.services.PayPalService;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);

            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            System.out.println("Geração de contrato: ");
            System.out.println("Valor total do contrato");
            double totalAmount = sc.nextDouble();
            sc.nextLine();
            System.out.println("Data do contrato no formato dd/MM/yyyy");
            Date date = sdf.parse(sc.nextLine());
            Contract contrato = new Contract(date, totalAmount);

            System.out.println("Nº contrato:" + contrato.getNumber());
            System.out.println("Qnt de parcelas: ");
            int installments = sc.nextInt();
            ContractService cs = new ContractService();
            cs.processContract(contrato, installments, new PayPalService());


            System.out.println(contrato.getInstallment());
        } catch(Exception e){
            System.out.println(e.getMessage());
            ;
        }


    }
}
