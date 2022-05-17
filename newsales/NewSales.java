package newsales;

import java.util.ArrayList;

public class NewSales {
    public static void main(String[] args) {

        ArrayList<Sale> arraySale = new ArrayList<Sale>();

        Sale s1  = new Sale("01", "producto 1");
        Payment p1 = new CashPayment(1000, 1500);
        s1.setPayment(p1);
        
        Sale s2  = new Sale("02", "producto 2");
        Payment p2 = new CreditCardPayment(1234567, 3000);
        s2.setPayment(p2);
        
        Sale s3  = new Sale("03", "producto 3");
        Payment p3 = new CashPayment(4400, 5300);
        s3.setPayment(p3);

        arraySale.add(s1);
        arraySale.add(s2);
        arraySale.add(s3);
    
        arraySale.stream().forEach((p)-> { p.getPayment().DetailPayment();});
    }
}

/*
Cash Payment : amount - 1000, Amount Tendered :1500 Change :500
Credit Card Payment : amount - 3000, Credit Card Number :1234567 authorize : false
Cash Payment : amount - 44000, Amount Tendered :53000 Change :9000
Cash Payment : amount - 1000, Amount Tendered :2000 Change :1000
*/